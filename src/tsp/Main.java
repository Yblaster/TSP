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
		
		
		
		City.createCity("20.in3");
		
		listOfCity = City.listOfCity;

		travel = Heuristique.heuristiqueTravel(listOfCity, listOfCity.size());
		
		
		traveledDistance = Heuristique.getTotalDistance() - 100000;
		System.out.println("taille ville = " + travel.size());
		
		System.out.println(traveledDistance);
		
		WriteFile.write(travel, traveledDistance,"20.out3");
		
		
		
		System.out.println("\n////////////////////////////\n");
		
		
		
		City.createCity("100.in3");
		
		listOfCity = City.listOfCity;

		
		travel = Heuristique.heuristiqueTravel(listOfCity, listOfCity.size());
		
	
		traveledDistance = Heuristique.getTotalDistance() - 100000;
		System.out.println("taille ville = " + travel.size());
		
		System.out.println(traveledDistance);
		
		WriteFile.write(travel, traveledDistance,"100.out3");
		
		
		
		System.out.println("\n////////////////////////////\n");
		
		
		
		City.createCity("1000.in3");
		
		listOfCity = City.listOfCity;

		
		travel = Heuristique.heuristiqueTravel(listOfCity, listOfCity.size());
		
	
		traveledDistance = Heuristique.getTotalDistance() - 100000;
		System.out.println("taille ville = " + travel.size());
		
		System.out.println(traveledDistance);
		
		WriteFile.write(travel, traveledDistance, "1000.out3");
	
		
	}
}
