package Journaling.Logger;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

//book 3 section 1.15

//INCOMPLETE

//keeps a breadcrumb trail of the events that occur in the game


public class OutputLog  extends Thread {

	public static ArrayList<String> log = new ArrayList<String>();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("necroteklog.txt", "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		writer.close();
	}
	
	public static void addToLog(String logstring)
	{
		log.add(logstring);
	}
	
	
	
}