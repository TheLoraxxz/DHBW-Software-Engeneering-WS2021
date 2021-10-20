package main.java.Cabine;

import main.java.FLF.FLF;
import main.java.FLF.PositionType;

public class Cabin {
    private FLF flf;

    public Cabin() {
        busDoors = new BusDoor[]{new BusDoor(),new BusDoor()};
        //this.flf = pflf;
        seats = new Seat[]{new Seat(PositionType.frontleft),new Seat(PositionType.frontright),new Seat(PositionType.backleft), new Seat(PositionType.backright)};
        energyDisplay = new EnergyDisplay();
        speedDisplay = new SpeedDisplay();
    }

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
