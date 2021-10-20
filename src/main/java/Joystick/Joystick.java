package main.java.Joystick;

import main.java.FLF.PositionType;

public abstract class Joystick {
    JoyStickFeeler feeler;

    PressureButton[] buttons;
    public Joystick() {
        feeler = new JoyStickFeeler();
        buttons = new PressureButton[]{new PressureButton(PositionType.left), new PressureButton(PositionType.right)};
    }

    public void tilt(byte[] tiltDirection) {

    }

    public JoyStickFeeler getFeeler() {
        return new JoyStickFeeler();
    }

    public PressureButton[] getButtons() {
        return new PressureButton[]{new PressureButton(this.buttons[0]), new PressureButton(this.buttons[1])};
    }
}
