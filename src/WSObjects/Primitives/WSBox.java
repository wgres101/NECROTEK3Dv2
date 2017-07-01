package WSObjects.Primitives;

import Services.ServiceRoot;
import UtilityTypes.Point3D;
import UtilityTypes.Vec3D;

public class WSBox {

	//axis aligned bounding box
	
	Point3D p_min; // (min x, min y, min z) (axis aligined box)
	Point3D p_max; // (max x, max y, max z) (axis aligned box)
	
	Point3D center_c;
	Vec3D D_0; //three orthonormal axes
	Vec3D D_1; //three orthonormal axes
	Vec3D D_2; ///three orthonormal axes
	
	
	//three extants are:
	//r_i > 0 for 0 <= i <= 2
	//any point is of the form
	//X = C + y0D0 + y1D1 + y2D2
	//
	//y0 <= r0
	//y1 <= r1
	//y2 <= r2
	
	
	
	public void Init(ServiceRoot BoxService)
	{
		//Called Init
	}
	

	//update is called once per tick
			//to update internal variables
			//and to execute per turn actions
			//used to update state
	public void Update()
	{
		//called Update
		//
		//place camera (transform it) from world space to local space
	}
	
	
		
		//called upon when object is no longer needed
		
		public void Destroy()
		{
			//called Destroy
		}
		
		//called every turn. checks messagemanager for message
		
		public void ParseMessage()
		{
			
		}
		
		
		public static void Launch() {}
		
		
		//called on object creation
		
		public static void Init() {}
		


		public static void  Render()
		{
			
		}

		public static void parseMessage()
		{
			
		}
		
		public static void  Collision()
		{
			
		}
		
		//when the game requires this particular state to be active
		
		public static void  OnEnter()
		{
			
		}
		
		//When the object no longer needs to be attachd to the scene graph
		
		public static void  OnExit()
		{
		}

		//for exammple, hitting the pause button
		
		public static void  OnSuspend()
		{
		}
		
}
