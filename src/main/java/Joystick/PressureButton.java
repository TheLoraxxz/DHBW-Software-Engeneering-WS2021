package main.java.Joystick;

import main.java.ExtinguishDevices.Cannon;
import main.java.ExtinguishDevices.FrontCannon;
import main.java.FLF.PositionType;

public class PressureButton implements IFeeler {

    private PositionType position;

    private Cannon cannon;

    public PressureButton(PositionType pos, Cannon cannon) {
        position = pos;
        this.cannon = cannon;
    }

    @Override
    public void press() {
        if (this.cannon instanceof FrontCannon) {

        } else {

        }
    }


    public PositionType getPosition() {
        return position;
    }
    public Cannon getCannon() {
        return cannon;
    }
}
