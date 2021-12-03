package juris.model;

import java.util.ArrayList;

public class FuelStorage {
    int volume;
    int amountOfFuel;
    private String fuelType; // diesel, petrol

    public FuelStorage(int volume, int amountOfFuel, String fuelType) {
        this.volume = volume;
        this.amountOfFuel = amountOfFuel;
        this.fuelType = fuelType;
    }

    public void addFuel(int liters) {
        this.amountOfFuel += liters; // TODO jāpapildina ar kontroli vai vispār var piepildīt
    }
}
