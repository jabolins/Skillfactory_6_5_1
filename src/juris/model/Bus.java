package juris.model;

import java.util.ArrayList;

public class Bus extends Transport{
    int passengerSeats;

    public Bus(String brand, String number, String fuelType, double fuelConsumption100km, int averageMileageDay, int passengerSeats) {
        super(brand, number, fuelType, fuelConsumption100km, averageMileageDay);
        this.passengerSeats = passengerSeats;
    }
}
