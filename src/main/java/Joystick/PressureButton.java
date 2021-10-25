package main.java.Joystick;

import main.java.FLF.PositionType;

public class PressureButton implements IFeeler {

    private PositionType position;

    PressureButton(PositionType pos) {
        position = pos;
    }

    PressureButton(PressureButton pressureButton) {
        this.position = pressureButton.getPosition();
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

}
