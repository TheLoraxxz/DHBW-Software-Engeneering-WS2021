package main.java.Operator;

import main.java.ExtinguishDevices.HeadCannon;
import main.java.Joystick.Joystick;

public class JoystickHeadCanon extends Joystick {
    private HeadCannon headCanon;
    JoystickHeadCanon(HeadCannon canon) {
        super();
        this.headCanon = canon;
    }
}
