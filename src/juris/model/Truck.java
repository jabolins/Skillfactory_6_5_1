package juris.model;

public class Truck extends Transport{
    /**
     * maximum load capacity in kilograms
     */
    int loadCapacity;

    public Truck(String brand,
                 String licensePlateNr,
                 String fuelType,
                 double fuelConsumption100km,
                 int averageMileageDay,
                 int loadCapacity) {
        super(brand,
                licensePlateNr,
                fuelType,
                fuelConsumption100km,
                averageMileageDay);
        this.loadCapacity = loadCapacity;
    }
}
