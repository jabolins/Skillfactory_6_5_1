package juris.model;

public class ElectricityGenerator implements UsesFuel {
    String manufacture;
    Double fuelPerHour;
    private String fuelType;

    public ElectricityGenerator(String manufacture, Double fuelPerHour, String fuelType) {
        this.manufacture = manufacture;
        this.fuelPerHour = fuelPerHour;
        this.fuelType = fuelType;
    }

    public String getManufacture() {
        return manufacture;
    }

    public Double getFuelPerHour() {
        return fuelPerHour;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public double usesFuelPerDay() {
        return fuelPerHour*24;
    }
}
