package main.java.Joystick;

import main.java.ExtinguishDevices.Cannon;
import main.java.ExtinguishDevices.CannonState;
import main.java.ExtinguishDevices.HeadCannon;

public class JoyStickFeeler implements IFeeler{
    private Cannon cannon;
    public JoyStickFeeler(Cannon cannon) {
        this.cannon=cannon;
    }
    @Override
    public void press() {
        if (cannon.getCannonState()== CannonState.active) {
            cannon.pumpOut();
        }
    }
}
