package GenericComponentLIbrary.SampleImplementation;

public class CPlayer extends CComponent implements IMovable {

	float x, y;
	
	Player()
	{
		ExposeInterface<Movable>(this);
		
	}
	
	void GetPosition(float x, float y)
	{
		x = this.x;
		y = this.y;
		
	}
	
	void SetPosition(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	
}
