package juris;

import juris.model.*;
import juris.services.Reports;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<UsesFuel> allFuleUsers = new ArrayList<>();
        Bus bus1 = new Bus("Mercedes", "aa11", "PETROL", 12.4, 50, 32);
        allFuleUsers.add(bus1);
        Truck truck1 = new Truck("Scanie", "tt23", "DIESEL", 21.4, 50, 4000);
        allFuleUsers.add(truck1);
        ElectricityGenerator electricityGenerator = new ElectricityGenerator("Mercedes", 6.2, "DIESEL");
        allFuleUsers.add(electricityGenerator);
        FuelStorage fuelStorage1 = new FuelStorage(300, "DIESEL");
        FuelStorage fuelStorage2= new FuelStorage(200, "PETROL");
        FuelStorage.addFuel(200, "DIESEL");
        FuelStorage.addFuel(300, "PETROL");
        System.out.println(Reports.balanceDieselDays(allFuleUsers));
        System.out.println(Reports.balancePetrolDays(allFuleUsers));
    }
}
