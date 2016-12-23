package Services.GeneralCodePerformanceServices;


//GEMS 7



//EXCEPTION HANDLING

public class AdvancedDebuggingTechniquesService {

	public void page_hook() { } //implements a try-catch block on a piece of code that doesn't throw an exception
								//i.e., a place where there is a bug or error but does not throw an exception
	public void page_end() { }  //end of the hook
	
	public void page_process() { } //exception handling if it occurs between hook() and end()
	
}
