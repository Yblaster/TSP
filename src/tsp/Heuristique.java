package tsp;

import java.util.ArrayList;
import java.util.Collections;


public class Heuristique {
	
	static ArrayList<City> listOfCityLeft = new ArrayList<>();
	static ArrayList<City> listOfCityVisited = new ArrayList<>();
	static double totalDistance = 0;
	
	public static ArrayList<City> heuristiqueTravel(ArrayList<City> listOfCity, int nbrOfCity){
		
			listOfCityLeft.clear();
			listOfCityVisited.clear();
			totalDistance = 0;
			
			
			for (int j = 0; j < listOfCity.size(); j++) {
				
				listOfCityLeft.add(listOfCity.get(j));
				
			}
		
			int indexOfCityToRemove;
			
			listOfCityVisited.add(listOfCityLeft.get(0));
			listOfCityLeft.remove(0);
			
		
			
			for (int i = 0; i < nbrOfCity - 1; i++ ) {
				
				indexOfCityToRemove = distanceToCity(listOfCityVisited.get(i), listOfCityLeft);
				listOfCityVisited.add(listOfCityLeft.get(indexOfCityToRemove));
				listOfCityLeft.remove(indexOfCityToRemove);
				
			}
			
			
			
			//ajout distance du dernier voyage de la derniere ville a la premiere ville 
			double x = listOfCityVisited.get(listOfCityVisited.size() -1).getX() - listOfCityVisited.get(0).getX();
			double y = listOfCityVisited.get(listOfCityVisited.size() -1).getY() -  listOfCityVisited.get(0).getY();
			double result = Math.sqrt(Math.pow(x,  2) + Math.pow(y, 2));
			totalDistance += result;
			
		
		System.out.println(" listOfCityVisited = " + listOfCityVisited.size());
		return listOfCityVisited;
		
	}
	
	
	public static int distanceToCity(City cityA, ArrayList<City> cityLeft) {
		
		
		
		int sizeOfCity = cityLeft.size() - 1;
		double result = 100000;
		int indexOfNearestCity = 0;
		
		for (int i = 0; i < sizeOfCity; i++) {
			
			double x = Math.abs(cityA.getX() - cityLeft.get(i).getX());
			double y = Math.abs(cityA.getY() - cityLeft.get(i).getY());
			
			
			if (result > Math.sqrt(Math.pow(x,  2) + Math.pow(y, 2))) {
				result = Math.sqrt(Math.pow(x,  2) + Math.pow(y, 2));
				indexOfNearestCity = i;
				
			}	
			
		
		}
		
		totalDistance += result;
		return indexOfNearestCity;
	
	}
	

	public static double getTotalDistance() {
		// TODO Auto-generated method stub
		return totalDistance;
	}

}
