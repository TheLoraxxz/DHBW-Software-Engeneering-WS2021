package main.java.Joystick;

import main.java.ExtinguishDevices.Cannon;
import main.java.ExtinguishDevices.HeadCannon;

public class JoyStickFeeler implements IFeeler{
    private Cannon cannon;
    public JoyStickFeeler(Cannon cannon) {
        this.cannon=cannon;
    }
    @Override
    public void press() {
        cannon.pumpOut();

    }

    @Override
    public void release() {

    }
}
