package GameAI;

public class QState {

	//queue object
	
	//when an object needs a lock, it creates a qstate
	//each qstate object has a unique identifier for every object that is added to it.
	//each object that requires that specific qstate is pushed to the end of the queue
	//the object on the front of the queue is popped once it is done executing its
	//critical section. Control is handed over to the next object in the queue
	//and so on....
	
}
