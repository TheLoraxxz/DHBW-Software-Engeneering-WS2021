package main.java.Cabine;

import main.java.Driver.DriverSection;
import main.java.FLF.Batteries;
import main.java.FLF.PositionType;
import main.java.Operator.OperatorSection;

public class Cabin {

    public Cabin(DriverSection driverSection,OperatorSection operatorSection,Batteries[] batteries,double speed) {
        seats = new Seat[]{
            new Seat(PositionType.frontleft,driverSection),
            new Seat(PositionType.frontright,operatorSection),
            new Seat(PositionType.backleft), 
            new Seat(PositionType.backright)};
        busDoors = new BusDoor[]{new BusDoor(PositionType.left,seats),new BusDoor(PositionType.right,seats)};
        energyDisplay = new EnergyDisplay(batteries);
        speedDisplay = new SpeedDisplay(speed);
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
