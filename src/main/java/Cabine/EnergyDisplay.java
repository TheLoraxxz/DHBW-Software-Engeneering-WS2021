package main.java.Cabine;

import main.java.FLF.Batteries;

public class EnergyDisplay implements IDisplay{

    private Batteries[] batteries;
    public EnergyDisplay(Batteries[] batteries) {
        this.batteries = batteries;
    }
    @Override
    public String show() {
        double capacityRest = 0;
        for (Batteries battery : batteries) {
            capacityRest = capacityRest+battery.getCapacity();
        }

        return capacityRest+"/400000";
    }
}
