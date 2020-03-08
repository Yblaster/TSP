package tsp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
	
	
	public static ArrayList<City> read(String fileName) {
		
		ArrayList<City> listCity = new ArrayList<>(); 
		
		
		File f = new File("src\\tsp\\Jeux_de_test\\" + fileName);
		
		

		
		try(Scanner sc = new Scanner(f)){
			
			sc.nextInt();
			
			while (sc.hasNextDouble()) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				
				listCity.add(new City(x, y));
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listCity;
	}

}
