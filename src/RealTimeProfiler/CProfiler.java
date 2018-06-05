package RealTimeProfiler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

import RealTimeProfiler.CProfile.state;

public class CProfiler  extends Thread {

	public static Stack<CProfile> g_samples = new Stack<CProfile>();
	public static Stack<CProfile> g_reversed = new Stack<CProfile>();
	public static ArrayList<CProfile> finish_list = new ArrayList<CProfile>();

	public static long beginFrame = 0;
	public static long endFrame = 0;

	
	
	public static HashMap<String, CProfile> entry_list = new HashMap<String, CProfile>();
	
	 
	
	public static ArrayList<CProfile> begin_list = new ArrayList<CProfile>();
	
	public static ArrayList<CProfile> end_list = new ArrayList<CProfile>();
	
	int current_profile_ctr = 0;
	
	double frameTime;

	public static void ProfileBegin(String name) {
		// get the time and store it in a profile along with the string name
		// push the profile to the stack
		CProfile profile = new CProfile();
		profile.startTime = System.nanoTime();
		profile.name = name;
		profile.profile_state = state.PROFILE_BEGIN;
		g_samples.push(profile);
	}

	public static void ProfileEnd(String name) {
		// get the time and stor eit in a profile along with the string name
		// push the profile to the stack
		//

		CProfile profile = new CProfile();
		profile.endTime = System.nanoTime();
		//System.out.println("ProfileEnd*****" + profile.endTime + "*****");
		profile.name = name;
		profile.profile_state = state.PROFILE_END;
		g_samples.push(profile);
	}

	public static void Calculate() {
		//System.out.println("Stack size &&&& " + g_samples.size());

		// stack sizes 2
		// reverse the stack
		while (!g_samples.empty()) {
			g_reversed.push(g_samples.pop());
		}

		while (!g_reversed.empty()) {
			finish_list.add(g_reversed.pop());
		}

		// finish list is 2

		CProfile entry = new CProfile();
		// in an array now, heirarchical
		for (int i = 0; i < finish_list.size(); i++) {
			CProfile profile = finish_list.get(i);

			//System.out.println("Iterate through finish list i" + i);
			// scanning through profile begin markers
			//if (profile.profile_state == state.PROFILE_BEGIN) {

				// in a profile begin
				// find matching endprofile
				// double over and scan
				// for (int j=0;j<finish_list.size();j++)
				// {
				//CProfile first_matching = new CProfile();
				//first_matching = finish_list.get(i);

				//if (profile.name.equals(first_matching.name)) {
					
				if (profile.profile_state == state.PROFILE_BEGIN)
				{
					CProfile prof = new CProfile();
					prof.startTime = profile.startTime;
					prof.name = profile.name;
					begin_list.add(prof);
				}
			
			
				if (profile.profile_state == state.PROFILE_END)
				{
					CProfile prof = new CProfile();
					prof.endTime = profile.endTime;
					prof.name = profile.name;
					end_list.add(prof);
				}
		
				
				for (CProfile beginProfile : begin_list)
				{
					for (CProfile endProfile : end_list)
					{
						if (beginProfile.name.equals(endProfile.name))
						{
							entry.profile_state = state.PROFILE_COMPLETE;
							entry.name = beginProfile.name;
							entry.endTime = endProfile.endTime;
							entry.startTime = beginProfile.startTime;
							entry.time_spent = entry.endTime - entry.startTime;
							
							entry_list.put(beginProfile.name, entry);
							
						}
							
					}
						
				}
		}

	}

	public static void Percentages() {

		//for (CProfile profile : entry_list) {
			// entrylist size 104 startes at 2
			//System.out.println("Number of entries in entrylist ^^^ " + entry_list.size());

		
/*			    
			
		
		Iterator<Map.Entry<String, CProfile>> it = map.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<String, CProfile> pair = it.next();
		    
		    	pair.getValue()
			
			
			
			double frameTime = endFrame - beginFrame;
*/
			//System.out.println("^^^^^^^endFrame:" + endFrame);
			//System.out.println("^^^^^^^beginFrame: " + beginFrame);

			// if (frameTime == 0)
			// {
			// System.out.println("Frametime is 0");
			//
			/// })
	/*		double time_frame_ratio = 0;
			try {
				time_frame_ratio = ((double) entry.time_spent / frameTime);

			} catch (ArithmeticException ar) {
				ar.printStackTrace();

			}
//
			//System.out.println("!!double time frame ratio" + time_frame_ratio);
			//System.out.println("!!frameTime" + frameTime);

			//System.out.println("^^^^^^frameTime" + (endFrame - beginFrame));
			//System.out.println("time spent " + (entry.endTime - entry.startTime) + "**********");
			//System.out.println("frametime!: " + frameTime + " *********");
			//System.out.println("Time Frame Ratio" + time_frame_ratio);

			//System.out.println("%%% entry_list size" + entry_list.size());
*/
	/*		
			}
			
			for (CProfile match : entry_list) {
				// System.out.println("@@@@ match.time_frame_ratio: " + match.time_frame_ratio);

				if (entry.name.equals(match.name)) {
					match.numberOfInstances++;
					entry.numberOfInstances++;
					match.accumulator++;
					entry.accumulator++;
					entry.frameTime = frameTime;
					entry.time_frame_ratio = time_frame_ratio;
					match.frameTime = frameTime;
					match.time_frame_ratio = time_frame_ratio;
					// found duplicate
					if (time_frame_ratio < match.time_frame_ratio) {
						match.min = time_frame_ratio;
						entry.min = time_frame_ratio;

						match.minPerc = time_frame_ratio / frameTime;
						entry.minPerc = time_frame_ratio / frameTime;

					}
					if (time_frame_ratio > match.time_frame_ratio) {
						match.max = time_frame_ratio;
						entry.max = time_frame_ratio;

						match.maxPerc = time_frame_ratio / frameTime;
						entry.maxPerc = time_frame_ratio / frameTime;
					}

					double average = match.min - match.max / match.numberOfInstances;

					if (average > match.ave) {
						match.ave = average;
						match.avePerc = average / frameTime;
						entry.ave = average;
						entry.avePerc = average / frameTime;
					}

					//System.out.println("$$$ entry_list size" + entry_list.size());

					// percents
*/
	/*			}
			}
		}
*/
	}


	public static void DumpStackContents() {
		// pop profiles into a list (queue?) so it is in order

		System.out.println(
				" Frametime begFrameTime enFrameTIme StartTime EndTime Time Frame Ratio Ave   Min     Max    Ave %   Min%  Max%  #  ProfileName");
		System.out.println("--------------------------------------------------------");
		
		
		Iterator<Map.Entry<String, CProfile>> it = entry_list.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<String, CProfile> pair = it.next();
		
			CProfile profile = pair.getValue();
		
		   
		//for (CProfile profile : entry_list) {
		//for (int i=0; i<entry_list.size();i++)
		//{
			//CProfile entry = entry_list.remove(i);
			long frameTime = endFrame - beginFrame;
			System.out.println(frameTime + "|" + beginFrame + "|" + endFrame + "|" + profile.startTime + " | "
					+ profile.endTime + " | " + profile.time_frame_ratio + "|" + profile.ave + "| " + profile.min + "| "
					+ profile.max + "| " + profile.avePerc + " |" + profile.minPerc + " |" + profile.maxPerc + "|"
					+ profile.numberOfInstances + "| " + profile.name);
		
		}

	}
	
	public static void WriteStackContents() throws IOException {
	
		File file = new File("profiler.html");
		
		Writer writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(
			          new FileOutputStream(file)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		writer.append("<!DOCTYPE html>");
		writer.append("<HTML>");
		writer.append("<BODY>");
		writer.append("<h1>" + "Debug Page" + "</h1>");
	  
		Iterator<Map.Entry<String, CProfile>> it = entry_list.entrySet().iterator();
		while (it.hasNext())
		{
		    Entry<String, CProfile> pair = it.next();
		
			CProfile profile = pair.getValue();
		
		
		
		writer.append("</br></br></br>");
		//writer.write("<font size = \"6\">");
		
		
		writer.append(
				" Frametime begFrameTime enFrameTIme StartTime EndTime Time Frame Ratio Ave   Min     Max    Ave %   Min%  Max%  #  ProfileName");
		writer.append("</br>--------------------------------------------------------<br/>");
		
		
		
		long frameTime = endFrame - beginFrame;
		writer.append(frameTime + "|" + beginFrame + "|" + endFrame + "|" + profile.startTime + " | "
				+ profile.endTime + " | " + profile.time_frame_ratio + "|" + profile.ave + "| " + profile.min + "| "
				+ profile.max + "| " + profile.avePerc + " |" + profile.minPerc + " |" + profile.maxPerc + "|"
				+ profile.numberOfInstances + "| " + profile.name);
		}
		writer.append("<br/>");
		writer.close();
	}

	@Override
	public void run() {
		while(true)
		{
			try {
				WriteStackContents();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		
			try {
			
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		// TODO Auto-generated method stub
		//try {
		//	Thread.sleep(100000);
		//} catch (InterruptedException e) {
		//	// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		

	}

}
