package tsp;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Travel {

    private ArrayList<City> travel = new ArrayList<>();
    private ArrayList<City> previousTravel = new ArrayList<>();

    public Travel(ArrayList<City> cities) {
        this.travel = cities;
    }

    public void swapCities() {
        int a = generateRandomIndex();
        int b = generateRandomIndex();
        previousTravel = travel;
        City x = travel.get(a);
        City y = travel.get(b);
        travel.set(a, y);
        travel.set(b, x);
    }

    public void revertSwap() {
        travel = previousTravel;
    }

    private int generateRandomIndex() {
        return ThreadLocalRandom.current().nextInt(0, travel.size());
    }

    public City getCity(int index) {
        return travel.get(index);
    }

    public int getDistance() {
        int distance = 0;
        for (int index = 0; index < travel.size(); index++) {
            City start = getCity(index);
            City destination;
            if (index + 1 < travel.size()) {
                destination = getCity(index + 1);
            } else {
                destination = getCity(0);
            }
            distance += City.getDistance(start, destination);
        }
        return distance;
    }

    public ArrayList<City> getTravel() {
        return travel;
    }
}
