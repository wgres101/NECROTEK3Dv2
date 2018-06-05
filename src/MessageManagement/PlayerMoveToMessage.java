package MessageManagement;

import SchedulingManager.EEventMachine;

public class PlayerMoveToMessage extends Message {

	static int x,y,z;
	
	public EEventMachine mflag = EEventMachine.EM_PLAYER_MOVETO;
	
	public static void MoveTo(int mx, int my, int mz)
	{
		x = mx;
		y = my;
		z = mz;
	}
	
}
