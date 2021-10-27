package main.java.Driver;

import main.java.Engine.ElectricMotor;
import main.java.Engine.PivotTurnable;
import main.java.ExtinguishDevices.FrontCannon;
import main.java.FLF.PositionType;
import main.java.Lights.TurnSignalLight;
import main.java.Person.Driver;

public class DriverSection {
    private Driver driver;
    private GasPedal gasPedal;
    public GasPedal getGasPedal() {
        return gasPedal;
    }

    private BreakPedal breakPedal;
    public BreakPedal getBreakPedal() {
        return breakPedal;
    }
    private PositionType relativePositionToControlPanel;
    private SteeringWheel steeringWheel;
    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public JoystickFrontCannon getJoystickFrontCannon() {
        return joystickFrontCannon;
    }

    private JoystickFrontCannon joystickFrontCannon;

    public DriverSection(TurnSignalLight[] turnLight,PivotTurnable[] pivotTurnable,double speed,ElectricMotor[] motors,FrontCannon cannon) {
        relativePositionToControlPanel = PositionType.left;
        gasPedal = new GasPedal(speed,motors);
        breakPedal = new BreakPedal(speed,motors);
        steeringWheel = new SteeringWheel(turnLight,pivotTurnable);
        joystickFrontCannon = new JoystickFrontCannon(cannon);
    }
    public PositionType getPosition() {
        return this.relativePositionToControlPanel;
    }
    public void setDriver(Driver person) {
        this.driver = person;
    }
    public Driver getDriver() {
        return driver;
    }
}
