package main.java.Joystick;

import main.java.ExtinguishDevices.Cannon;

public class JoyStickFeeler implements IFeeler{
    private Cannon cannon;
    public JoyStickFeeler(Cannon cannon) {
        this.cannon=cannon;
    }
    @Override
    public void press() {
        this.cannon.pumpOut();
    }

    @Override
    public void release() {

    }
}
