package EmoScript;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParserClass {

	//datatypes: int, float, bool 
	//keywords
	//operators
	//variables
	public void Create() { }
	
	public void ProcessSource() //reads tokens directly into token list
	{
		
		//RESERVE SOME KEYWORDSS AND TOKENS
				ReserveKeyWords("[");
				ReserveKeyWords("]");
				
		/**************************************/
		
		try{
	        FileReader fr= new FileReader("script.txt");
	        BufferedReader br= new BufferedReader(fr);

	        String str;


	    while ((str=br.readLine()) != null){
	            
	      }
	     br.close();

	    }catch (IOException e){
	        //out.println("File Not Found!");
	    }

		TokenList tokenList = new TokenList();
		Create();
		
		
		//Now parse the file
		
		
	}
	
	
	public void ReserveKeyWords(String keyword)
	{
		
	}
	
}
