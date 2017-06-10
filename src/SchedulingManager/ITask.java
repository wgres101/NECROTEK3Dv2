package SchedulingManager;

public interface ITask {

	int ExecCounter = 0; //optional counter for when Execute is called
	int SyncCounter = 0;
	void Execute();
	void GetDependencies(ITask[] Deps); //return addresses and number of tasks
	void OnExecuted(); //task is executed when this is called and synccounter is 0
	
	
	
}
