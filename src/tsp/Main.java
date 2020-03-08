package tsp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		

		
		
		ArrayList<City> listOfCity = new ArrayList<>();
		ArrayList<City> travel = new ArrayList<>();
		double traveledDistance;
		
		
		

		
		ReadFile createCity20 = new ReadFile();
		listOfCity = createCity20.read("20.in3");

		travel = Heuristique.heuristiqueTravel(listOfCity);
		traveledDistance = Heuristique.totalDistance(travel);
		System.out.println(traveledDistance); 
		WriteFile.write(travel, traveledDistance, "20.out3");
		
		
		travel = Descente.descenteLocale(travel);
		traveledDistance = Heuristique.totalDistance(travel);
		System.out.println(traveledDistance); 
	
		
		
		
		
		
		ReadFile createCity100 = new ReadFile();
		listOfCity = createCity100.read("100.in3");
		
		travel = Heuristique.heuristiqueTravel(listOfCity);
		traveledDistance = Heuristique.totalDistance(travel);
		WriteFile.write(travel, traveledDistance, "100.out3");
		
		
		ReadFile createCity1000 = new ReadFile();
		listOfCity = createCity100.read("1000.in3");
		
		travel = Heuristique.heuristiqueTravel(listOfCity);
		traveledDistance = Heuristique.totalDistance(travel);
		WriteFile.write(travel, traveledDistance, "1000.out3");
		
		
	}
}
