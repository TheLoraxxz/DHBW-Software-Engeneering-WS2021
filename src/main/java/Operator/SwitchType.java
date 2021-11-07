package main.java.Operator;

import main.java.ExtinguishDevices.GroundSprayNozzles;

public enum SwitchType {
    electroMotor(-1),
    groundSprayNozzles(-2),
    headLightsFront(4),
    warningLights(2),
    headLightsRoof(3),
    SideLights(1),
    BlueLights(0);
    private int value;
    private SwitchType(int value) {

    }
    public int getValue() {
        return this.value;
    }
}
