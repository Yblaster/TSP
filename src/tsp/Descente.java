package tsp;

import java.util.ArrayList;
import java.util.Collections;

public class Descente {
	
	public static ArrayList<City> descenteLocale(ArrayList<City> listOfCity) {
		
		ArrayList<City> listOfCityVisited = new ArrayList<>(listOfCity);
		

		for (City cityA : listOfCity) {
			for (City cityB : listOfCity) {
				if (cityA != cityB) {
					ArrayList<City> neighbour = new ArrayList<>(listOfCity);
					
					Collections.swap(neighbour, listOfCity.indexOf(cityA), listOfCity.indexOf(cityB));
					ArrayList<City> newListOfCityVisited = new ArrayList<>(neighbour);
					
					if (Heuristique.totalDistance(newListOfCityVisited) < Heuristique.totalDistance(listOfCityVisited)){
						listOfCityVisited = newListOfCityVisited;
					}
				}
			}
		}
		
		return listOfCityVisited;
	}

}
