package main.java.Driver;

import main.java.FLF.PositionType;
import main.java.Lights.TurnSignalLight;

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

    public DriverSection(TurnSignalLight[] turnSignalLight) {
        relativePositionToControlPanel = PositionType.left;
        gasPedal = new GasPedal();
        breakPedal = new BreakPedal();
        steeringWheel = new SteeringWheel(turnSignalLight);
        joystickFrontCannon = new JoystickFrontCannon();
    }
}
