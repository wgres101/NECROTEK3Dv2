package Services.StateMachineInterfaceServices;

import java.util.ArrayList;

public interface StateMachineService {

	public int maxNumberOfTransitions  = 0;
	
	ArrayList<Integer> inputLIstForTransitions= new ArrayList<Integer>();
	ArrayList<Integer> outputStateArray= new ArrayList<Integer>();

	public int uniqueStateID = 0;

	public  void GetID();
	
	public  void addTransition(int inputState, int outputState);
	
	public  void deleteTransition(int outputId);
	
	public  void BeginStateMachine();
	
	public  void EndStateMachine();
	
	public int currentStat = 0;
	
	public  void OnEnter(int state);
	
	public  void OnExit(int state);
	
	public  void OnUpdate(int state);
	
	public  void OnMsg(String message);
	
	public  void SetState(int name);
	
	public  void SetCurrentState(String name);
	
	public  void SendMsg(Object message);
	
	public  void SenDelayedMessage(Object delayed_message);
	
}
