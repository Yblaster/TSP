package tsp;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RecuitSim {

    public static double calculate(Travel travel, double temperature, int numberOfIterations, double cooling, String file) {
        System.out.println("Début recuit simulé temperature: " + temperature + ", # itérations: " + numberOfIterations + " et refroidissement: " + cooling);
        double t = temperature;

        double bestDistance = travel.getDistance();
        System.out.println("Distance initiale: " + bestDistance);
        ArrayList<City> bestSolution = null;
        Travel currentSolution = travel;

        for (int i = 0; i < numberOfIterations; i++) {
            while (t > 0.1) {
                currentSolution.swapCities();
                double currentDistance = currentSolution.getDistance();
                if (currentDistance < bestDistance) {
                    bestSolution = new ArrayList<>(currentSolution.getTravel());
                    bestDistance = currentDistance;
                } else if (Math.exp((bestDistance - currentDistance) / t) < Math.random()) {
                    currentSolution.revertSwap();
                }
                t *= cooling;
            }
            // if (i % 100 == 0) { System.out.println("Iteration #" + i); }
        }
        //System.out.println("distance parcourue recuit simulé bestSol : " + new Travel(bestSolution).getDistance());
        WriteFile.write(bestSolution, bestDistance, file);
        return bestDistance;
    }
}
