package Central;

public class Vertex {

	public float x;
	public Float y;
	public float z;
	
	Vertex(float x, float y, float z)
	{
		this.x =x;
		this.y = y;
		this.z = z;
	}
	
	public Vertex()
	{
		
	}
	
	public void print()
	{
		System.out.println("Vertex: " + " " + x + " " + y + " " + z);
	}
	
}
