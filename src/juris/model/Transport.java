package juris.model;

public abstract class Transport implements UsesFuel {

    /**
     * transport manufacturer
     */
    private String brand;
    /**
     * car license plate
     */
    private String licensePlateNr;
    /**
     * fuel type must by DIESEL or PETROL
     */
    private String fuelType;
    /**
     * average fuel consumption per 100 km in liters
     */
    private double fuelConsumption100km;
    /**
     * average daily vehicle mileage (planned or actual)
     */
    private int averageMileageDay;

    @Override
    public double usesFuelPerDay(){
        return getAverageMileageDay()*getFuelConsumption100km()/100;
    }

    public Transport(String brand,
                     String licensePlateNr,
                     String fuelType,
                     double fuelConsumption100km,
                     int averageMileageDay) {
        this.brand = brand;
        this.licensePlateNr = licensePlateNr;
        this.fuelType = fuelType;
        this.fuelConsumption100km = fuelConsumption100km;
        this.averageMileageDay = averageMileageDay;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelConsumption100km() {
        return fuelConsumption100km;
    }

    public int getAverageMileageDay() {
        return averageMileageDay;
    }
}
