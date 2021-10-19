package main.java.Driver;

import main.java.FLF.PositionType;

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

    public DriverSection() {
        relativePositionToControlPanel = PositionType.left;
    }
}
