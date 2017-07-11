package GameMap;

import java.util.Vector;

public class Map {

	Vector<Vector<Hexagon>> s = new Vector<Vector<Hexagon>>();
	
	public void init()
	{
		for (int i=0;i<30;i++)
		{
			for (int j=0;j<30;j++)
			{
				s.get(i).get(j).skewed_x = i*s.get(i).get(j).x_axis_size;
				s.get(i).get(j).skewed_y = j*s.get(i).get(j).y_axis_size;
			}
		}
	}
	
	public Hexagon getHexagonByIndex(int x, int y)
	{
		return s.get(x).get(y);
	
	}
	public Hexagon getHexagonByCoordinates(int x, int y)
	{
		for (int i=0;i<30;i++)
		{
			for (int j=0;j<30;j++)
			{
				if ((x < s.get(i).get(j).skewed_x)  && x > (s.get(i).get(j).skewed_x - s.get(i).get(j).x_axis_size )
					&& ((y < s.get(i).get(j).skewed_y) && y > (s.get(i).get(j).skewed_y - s.get(i).get(j).y_axis_size))) 
				{
					return s.get(i).get(j);
				}
			}
		}
		
		return null;
	}
}
