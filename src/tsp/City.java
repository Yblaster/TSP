package tsp;

import java.util.ArrayList;

public class City {

	
	static ArrayList<City> listOfCity = new ArrayList<>();
	static ArrayList<Double> listOfx;
	static ArrayList<Double> listOfy;
	static int nbrOfCity;
	double x,y;
	
	public City(double x, double y) {
	this.x = x;
	this.y = y;
		
	}
	
	
	
	public static void createCity(String fileName) {
		
		ReadFile.read(fileName);
		
		listOfCity.clear();

		
		nbrOfCity = ReadFile.getNbrOfCity();
		ArrayList<Double> listOfx = ReadFile.getListOfx();
		ArrayList<Double> listOfy = ReadFile.getListOfy();
		
		System.out.println("nbrOfCity");

		for (int i = 0; i < nbrOfCity; i++) {
			listOfCity.add(new City(listOfx.get(i),listOfy.get(i)));
			
		}
		
	}



	public int getNbrOfCity() {
		return nbrOfCity;
	}

	public void setNbrOfCity(int nbrOfCity) {
		this.nbrOfCity = nbrOfCity;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public static ArrayList<City> getListOfCity() {
		return listOfCity;
	}


	public static void setListOfCity(ArrayList<City> listOfCity) {
		City.listOfCity = listOfCity;
	}


	
	
}
