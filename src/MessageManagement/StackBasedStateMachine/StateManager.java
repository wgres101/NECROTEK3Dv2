package MessageManagement.StackBasedStateMachine;

public class StateManager implements IBaseState{

	void Init() {};
	void Term() {};
	
	//register a state object and associate it with a string identifier
	boolean RegisterState(String name, IBaseState istate) { return false; }
	
	//will the current state change on the next update cycle
	boolean IsStateChangePending() {return false; }
	
	//Returns the current state
	String GetState() {return null; }

	
	//Get the state object based off the string ID
	
	IBaseState GetStateClass(String name) {
		return null;
	}
	
	//Get the state object on top of the current state stack
	
	//Passing bFlush = true will override any previous
	//state changing commands that may be pending
	//Otherwise, state commands will queue and be executed
	//in the order of tghe calls made
	
	
	//changes the current state on the next update cycle
	void PushState (String name, float fDelay, boolean bFlush)
	{
		
	}
	
	///Pops off the current state or states to reveal
	//a stored state underneath. You may not pop off the last state
	void PopState(int iStatesToPop, float fDely, boolean bFlush)
	{
		
	}
	
	
	//poops all but the last state
	void PopAllStates(float fDelay, boolean bFlush)
	{
		
	}
	
	//Updates the state machine internal mechanism
	// This function is called once by the main update
	//loop and should not be called by anyone else
	void Update(float dt) { }
	@Override
	public void OnEnter() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void OnExit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void OnSuspend() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void OnResume() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
