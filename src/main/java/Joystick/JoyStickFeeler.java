package main.java.Joystick;

import main.java.ExtinguishDevices.Cannon;
import main.java.ExtinguishDevices.CannonState;

public class JoyStickFeeler implements IFeeler{

    private Cannon canon;

    public JoyStickFeeler(Cannon canon) {
        this.canon = canon;
    }
    @Override
    public void press() {
        if(canon.getCannonState()==CannonState.active) {
        }
    }
}
