package Assignment;

import com.basics.Box;

public class point2D {

	int x;
	int y;
	
	public point2D(int x1, int y1) {
		
		x = x1;
		y = y1;
	}
	
	public String getDetails() {
		
		return "Point ("+x+","+y+")";
	}

}