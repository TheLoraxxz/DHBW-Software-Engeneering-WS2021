package main.java.Joystick;

import main.java.ExtinguishDevices.Cannon;
import main.java.ExtinguishDevices.MixDevice;

public class JoyStickFeeler implements IFeeler{

    private Cannon canon;
    private MixDevice mix;
    public JoyStickFeeler(Cannon canon) {

    }
    @Override
    public void press() {
        if(1==1) { //TODO: change this
            canon.pumpOut();
        }
    }
}
