package juris.model;

public class Transport {
    private String brand;
    private String number;
    private String fuelType; // diesel, petrol
    private double fuelConsumption100km; // fuel per 100 km
    private int averageMileageDay;

    public Transport(String brand, String number, String fuelType, double fuelConsumption100km, int averageMileageDay) {
        this.brand = brand;
        this.number = number;
        this.fuelType = fuelType;
        this.fuelConsumption100km = fuelConsumption100km;
        this.averageMileageDay = averageMileageDay;
    }
}
