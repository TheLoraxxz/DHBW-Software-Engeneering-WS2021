package main.java.Joystick;

import main.java.ExtinguishDevices.Cannon;
import main.java.ExtinguishDevices.HeadCannon;
import main.java.FLF.PositionType;

public class PressureButton implements IFeeler {

    private PositionType position;

    private Cannon cannon;

    public PressureButton(PositionType pos, Cannon cannon) {
        position = pos;
        this.cannon = cannon;
    }

    public PressureButton(PressureButton pressureButton) {
        this.position = pressureButton.getPosition();
        this.cannon = pressureButton.getCannon();
    }

    @Override
    public void press() {

    }

    @Override
    public void release() {

    }

    public PositionType getPosition() {
        return position;
    }
    public Cannon getCannon() {
        return cannon;
    }
}
