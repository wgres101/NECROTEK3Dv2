package GameMap;

import Journaling.CJournal;

public class CHexagonCoordinates {

	public int upper_left_x;
	public int upper_left_y;
	public int lower_right_x;
	public int lower_right_y;
	public int midleft_x;
	public int midleft_y;
	public int midright_x;
	public int midright_y;
	public int upper_right_x;
	public int upper_right_y;
	public int lower_left_x;
	public int lower_left_y;
	public int width;
	public int height;
	
	public CHexagonCoordinates()
	{
		return;
	}
	
	public CHexagonCoordinates(int ulx, int uly, int lrx, int lry, int mlx, int mly, int mrx, int mry, int urx, int ury, int llx, int lly, int width, int height)
	{
		upper_left_x = ulx;
		upper_left_y = uly;
		lower_right_x = lrx;
		lower_right_y = lry;
		midleft_x = mlx;
		midleft_y = mly;
		midright_x = mrx;
		midright_y = mry;
		upper_right_x = urx;
		upper_right_y = ury;
		lower_left_x = llx;
		lower_left_y = llx;
		this.width = width;
		this.height = height;
		CJournal.Journal(CHexagonCoordinates.class, "Creating hexagon coordinates object");
		
	}
	
}
