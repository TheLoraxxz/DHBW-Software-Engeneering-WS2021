package main.java.Operator;

import main.java.ExtinguishDevices.HeadCannon;
import main.java.ExtinguishDevices.MixDevice;
import main.java.Joystick.Joystick;

public class JoystickHeadCanon extends Joystick {
    private HeadCannon headCanon;
    private MixDevice mixDevice;
    public JoystickHeadCanon(HeadCannon canon, MixDevice mixing) {
        super();
        this.headCanon = canon;
        this.mixDevice = mixing;
    }
}
