package Debugger;

public class QAAutoTesterMacro {

	
	
	//causes a breakpoint wherever it is placed
	
	QAAutoTesterMacro(String breakpointName)
	{
		System.out.println("QA Break at:" + breakpointName);
		System.exit(0);
	}
	
}
