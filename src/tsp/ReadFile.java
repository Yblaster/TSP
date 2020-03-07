package tsp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
	
	static int nbrOfCity;
	static ArrayList<Double> listOfx = new ArrayList<>();
	static ArrayList<Double> listOfy = new ArrayList<>();
	

  
	

	
	public static void read(String fileName) {
		
		
		File f = new File("src\\tsp\\Jeux_de_test\\" + fileName);
		System.out.println("filename" + fileName);
		
		listOfx.clear();
		listOfy.clear();
		
		try(Scanner sc = new Scanner(f)){
			
			nbrOfCity = sc.nextInt();
			while (sc.hasNextDouble()) {
				listOfx.add(sc.nextDouble());
				listOfy.add(sc.nextDouble());
				
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("listOfX lenght = " + listOfx.size());
	}

	public static int getNbrOfCity() {
		return nbrOfCity;
	}


	public static ArrayList<Double> getListOfx() {
		return listOfx;
	}



	public static ArrayList<Double> getListOfy() {
		return listOfy;
	}

}
