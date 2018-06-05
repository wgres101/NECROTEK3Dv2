package Journaling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

import MessageManagement.Message;
import SchedulingManager.CScheduler;

public class JournalManager extends Thread {

	
	
	public static boolean journaling = false;
	
	static int numberOfIndents = 0;
	
	//public static  Stack<JournalNode> journal = new Stack<JournalNode>();
	static ConcurrentHashMap<KeyClass, JournalNode> journal = new ConcurrentHashMap<KeyClass, JournalNode>();
	
	static PrintWriter writer = null;
	
    public static File file = new File("journal.txt");
	public static File htmlFile = new File("journal.html");
    
    
	public static void InitJournal(File file) throws FileNotFoundException
	{
		//clear files
		PrintWriter pw = new PrintWriter("journal.txt");
		PrintWriter pw2 = new PrintWriter("journal.html");
		pw.close();
		pw2.close();
		
	}
    
	public static void beginJournal()
	{
		journaling = true;
		numberOfIndents++;

	}
	
	public static void endJournal()
	{
		
		
		journaling = false;
		numberOfIndents--;
		
		
		
	
	}
	public static void JournalEntry(Class classname, String name, String node) throws InterruptedException
	{
		JournalNode entry = new JournalNode();
		entry.message = node;
		entry.className = classname;
		entry.nodeName = name;
		entry.numberOfIndents = numberOfIndents;
		KeyClass k = new KeyClass("name");
		journal.put(k, entry);
		//System.out.println("Placing journal entry in map");
		//System.out.println("Map size is " + journal.size());
		//CJournal.Journal(JournalManager.class, "JournalEntry() " + "Name " + name);
		//JournalManager.JournalEntry(classname, name, node);
	}
	
	public static void JournalToFile()
	{
		 try {
				writer = new PrintWriter(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
				Map<KeyClass, JournalNode> map = new HashMap<KeyClass, JournalNode>();
				Iterator<Map.Entry<KeyClass, JournalNode>> entries = journal.entrySet().iterator();
				while (entries.hasNext()) {
				Map.Entry<KeyClass, JournalNode> entry = entries.next();


		        //CJournal.Journal(JournalManager.class, "Key String Name: " + entry.getKey().name);
		        //CJournal.Journal(JournalManager.class, "Node name is " +  entry.getValue().nodeName);
			
				for (int i=0; i<entry.getValue().numberOfIndents;i++)
				{
					writer.print("  ");
				}
				writer.append("Key String Name: " + entry.getKey().name);
				writer.append("Class Name:"+entry.getValue().className + " Function name: " + entry.getValue().nodeName + "  Message:" + entry.getValue().message);
				
		    }

		
		writer.close();
		
		JournalToHTML();
	}
	
	
	public static void JournalToHTML()
	{
		/*
		try {
			writer = new PrintWriter(htmlFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		Writer writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(
			          new FileOutputStream(htmlFile)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
		
		try {
		writer.append("<!DOCTYPE html>");
		writer.append("<HTML>");
		writer.append("<BODY>");
		writer.append("<h1>" + "Debug Page" + "</h1>");
		writer.append("</br></br></br>");
		//writer.write("<font size = \"6\">");
		Map<KeyClass, JournalNode> map = new HashMap<KeyClass, JournalNode>();
		Iterator<Map.Entry<KeyClass, JournalNode>> entries = journal.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<KeyClass, JournalNode> entry = entries.next();

			for (int i=0; i<entry.getValue().numberOfIndents;i++)
			{
				writer.append("  ");
			}
			writer.append("<p>");
			writer.append("Key Class: " + entry.getKey().name);
			writer.append("<b>Class Name: " + entry.getValue() + "</b>");

			writer.append("<i>Node name: " + entry.getValue().nodeName + "</i>");
			writer.append("<b>Message: </b>" + entry.getValue().message);
			//writer.write("</font>");
			
			writer.append("</p>");
			
		}
		writer.append("</body></html");
		writer.close();
		} catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//try {
		//	Thread.sleep(100000);
		//} catch (InterruptedException e) {
		//	// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		JournalManager.JournalToFile();
	}


}
