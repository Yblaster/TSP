package tsp;

import java.util.ArrayList;
import java.util.Collections;


public class Heuristique {
		
	
	
	public static ArrayList<City> heuristiqueTravel(ArrayList<City> listOfCity){
		
		ArrayList<City> visitedCity = new ArrayList<>();
	
		//on fait un premier parcour avec la premiere ville enregistrer
		visitedCity.add(listOfCity.get(0));
		listOfCity.remove(0);
		int nbrOfCity = listOfCity.size();
			
	
		for (int i = 0; i < nbrOfCity; i++ ) {
			City nearestCity = nearestCity(visitedCity.get(i), listOfCity);
			
			listOfCity.remove(nearestCity);
			visitedCity.add(nearestCity);
			
		}
		
		
	
		return visitedCity;
		
		

	

	}
	
	public static City nearestCity(City cityToTest, ArrayList<City> listOfCityLeft) {
		
		int indexOfNearestCity = 0;
		
		double result = 1000000;
		
		for (int i = 0; i < listOfCityLeft.size(); i++) {
			
			double x = Math.abs(cityToTest.x - listOfCityLeft.get(i).x);
			double y = Math.abs(cityToTest.y - listOfCityLeft.get(i).y);
			
			
			if (result > Math.sqrt(Math.pow(x,  2) + Math.pow(y, 2))) {
				result = Math.sqrt(Math.pow(x,  2) + Math.pow(y, 2));
				indexOfNearestCity = i;
				
			}
			
		}
		return listOfCityLeft.get(indexOfNearestCity);	
	}

	public static double totalDistance(ArrayList<City> cityVisited) {
		
		double distance = 0;
		
		for (int i = 1; i < cityVisited.size(); i++) {
			distance += City.getDistance(cityVisited.get(i), cityVisited.get(i-1));
			
		}
		
		distance += City.getDistance(cityVisited.get(cityVisited.size() - 1), cityVisited.get(0));
		
		
		return distance;
	}

}
