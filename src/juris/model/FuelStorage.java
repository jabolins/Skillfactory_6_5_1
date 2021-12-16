package juris.model;

public class FuelStorage {

    /**
     * volume of one fuel storage
     */
    private int volume;
    /**
     * type of fuel must buy PETROL or DIESEL
     */
    private String fuelType;
    /**
     * the amount of petrol in all storages
     */
    private static int totalPetrol = 0;
    /**
     * the amount of diesel in all storages
     */
    private static int totalDiesel = 0;
    /**
     * maximum possible amount of Petrol (sum of all storage volumes)
     */
    private static int totalVolumePetrol = 0;
    /**
     * maximum possible amount of Diesel (sum of all storage volumes)
     */
    private static int totalVolumeDiesel = 0;

    public FuelStorage(int volume, String fuelType) {
        this.volume = volume;
        this.fuelType = fuelType;
        if (fuelType.equals("DIESEL")) {
            totalVolumeDiesel += volume;
        } else if (fuelType.equals("PETROL")) {
            totalVolumePetrol += volume;
        }
    }

    public static int getTotalPetrol() {
        return totalPetrol;
    }

    public static int getTotalDiesel() {
        return totalDiesel;
    }

    /**
     *
     * @param liters - amount of fuel to be added in liters
     * @param fuelType - must be DIESEL or PETROL
     */
     static public void addFuel(int liters, String fuelType) {
        if (fuelType.equals("DIESEL")) {
            if ((totalDiesel + liters) > totalVolumeDiesel) {
                totalDiesel = totalVolumeDiesel;
            } else totalDiesel += liters;
        }
        if (fuelType.equals("PETROL")){
            if ((totalPetrol + liters) > totalVolumePetrol) {
                totalPetrol = totalVolumePetrol;
            } else totalPetrol+= liters;
        }
    }
}
