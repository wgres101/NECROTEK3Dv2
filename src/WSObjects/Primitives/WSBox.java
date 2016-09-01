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
	
	public void Update()
	{
		//called Update
	}
	
	public void Destroy()
	{
		//called Destroy
	}
	
}
