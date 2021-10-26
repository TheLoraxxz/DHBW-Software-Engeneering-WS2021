package main.java.Cabine;

import main.java.Driver.DriverSection;
import main.java.FLF.PositionType;
import main.java.Operator.OperatorSection;

public class Cabin {

    public Cabin(DriverSection driver,OperatorSection operator) {
        seats = new Seat[]{
            new Seat(PositionType.frontleft,driver),
            new Seat(PositionType.frontright,operator),
            new Seat(PositionType.backleft), 
            new Seat(PositionType.backright)};
        busDoors = new BusDoor[]{new BusDoor(PositionType.left,seats),new BusDoor(PositionType.right,seats)};
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
