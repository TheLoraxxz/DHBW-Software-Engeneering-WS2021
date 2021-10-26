package main.java.Operator;

public enum SwitchType {
    electroMotor(-1),
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
