package AI.Algorithms.MachineLearningSimple;

import java.util.PriorityQueue;

public class CUserControlState {

	public PriorityQueue<CActionRequest> actionRequestQueue = new PriorityQueue<CActionRequest>();
	
	
	public void clearActionRequestQueue() { }
	public void dequeAction() { }
	public void performAction() { }
	public void queueAction() { }
	public void requestAction() { }
	
}
