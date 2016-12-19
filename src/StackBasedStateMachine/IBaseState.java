package StackBasedStateMachine;

public interface IBaseState {

	
	
	public void OnEnter();
	
	public void Update();
	
	public void OnExit();
	
	public void OnSuspend();
	
	public void OnResume();
	
	
}
