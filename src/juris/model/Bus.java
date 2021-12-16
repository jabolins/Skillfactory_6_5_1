package juris.model;

public class Bus extends Transport{

    /**
     * count of passenger seats in the bus
     */
    int passengerSeats;

    public Bus(String brand,
               String licensePlateNr,
               String fuelType,
               double fuelConsumption100km,
               int averageMileageDay,
               int passengerSeats) {
        super(brand,
                licensePlateNr,
                fuelType,
                fuelConsumption100km,
                averageMileageDay);
        this.passengerSeats = passengerSeats;
    }
}
