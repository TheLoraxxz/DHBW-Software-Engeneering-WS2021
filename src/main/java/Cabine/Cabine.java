package main.java.Cabine;

import main.java.FLF.FLF;

public class Cabine {
    private FLF flf;

    public BusDoor[] getBusDoors() {
        return busDoors;
    }

    private BusDoor[] busDoors;

    public Seat[] getSeats() {
        return seats;
    }

    private Seat[] seats;

    public EnergyDisplay getEnergyDisplay() {
        return energyDisplay;
    }

    private EnergyDisplay energyDisplay;

    public SpeedDisplay getSpeedDisplay() {
        return speedDisplay;
    }

    private SpeedDisplay speedDisplay;
}
