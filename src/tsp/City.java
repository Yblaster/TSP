package tsp;

import java.util.ArrayList;

public class City {

	

	double x,y;
	
	public City(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	
	
	public static double getDistance(City a, City b ) {
		
		return Math.sqrt(Math.pow((b.x-a.x),2)+Math.pow((b.y-a.y),2));
		
	}
	
	
}
