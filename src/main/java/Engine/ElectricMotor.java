package main.java.Engine;

public class ElectricMotor {
    private boolean isOn;
    public ElectricMotor() {
        isOn = false;
    }
    public void ConsumeEnergy(double speed) {

    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isOn() {
        return isOn;
    }
}
