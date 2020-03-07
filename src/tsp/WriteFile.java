package tsp;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteFile {
	
	public static void write(ArrayList<City> listOfCity, double totalDistance, String fileName) {
		
		
		
		try (PrintWriter writer = new PrintWriter("src\\tsp\\Jeux_de_test\\" + fileName)){
			
			writer.println(listOfCity.size());
			writer.println(totalDistance);
			
			for (int i = 0; i <listOfCity.size(); i++) {
				writer.println(listOfCity.get(i).getX() + " " + listOfCity.get(i).getY());
			}
			
			
		}catch(FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
