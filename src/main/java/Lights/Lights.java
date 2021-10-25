package main.java.Lights;

import main.java.FLF.PositionType;

public abstract class Lights {
    public Lights() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    protected boolean isOn;
    protected PositionType position;

    public void changeLight() {
        isOn = !isOn;
    }

    public PositionType getPosition() {
        return position;
    }
}
