package juris.services;

import juris.model.FuelStorage;
import juris.model.Transport;
import juris.model.UsesFuel;

import java.util.ArrayList;

public class Reports {
    /**
     *
     * @param allFuelUsers- ArrayList<UsesFuel>
     * @return full number of days until diesel runs out
     */
    static public int balanceDieselDays(ArrayList<UsesFuel> allFuelUsers) {
        double dieselConsumPerDay = 0;
        for (int i = 0; i < allFuelUsers.size(); i++) {
            if (allFuelUsers.get(i).getFuelType().equals("DIESEL")) {
                dieselConsumPerDay += allFuelUsers.get(i).usesFuelPerDay();
            }
        }
        return (int) (FuelStorage.getTotalDiesel() / dieselConsumPerDay);
    }

    /**
     *
     * @param allFuelUsers- ArrayList<UsesFuel>
     * @return full number of days until petrol runs out
     */



    public static int balancePetrolDays(ArrayList<UsesFuel> allFuelUsers) {
        double petrolConsumPerDay = 0;
        for (int i = 0; i < allFuelUsers.size(); i++) {
            if (allFuelUsers.get(i).getFuelType().equals("PETROL")) {
                petrolConsumPerDay += allFuelUsers.get(i).usesFuelPerDay();
            }
        }
        return (int) (FuelStorage.getTotalPetrol() / petrolConsumPerDay);
    }
}
