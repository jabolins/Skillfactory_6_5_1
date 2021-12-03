package juris.model;

import java.util.ArrayList;

public class Truck extends Transport{
    int loadCapacity;

    public Truck(String brand, String number, String fuelType, double fuelConsumption100km, int averageMileageDay, int loadCapacity) {
        super(brand, number, fuelType, fuelConsumption100km, averageMileageDay);
        this.loadCapacity = loadCapacity;
    }
}
