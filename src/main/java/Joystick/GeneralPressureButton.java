package main.java.Joystick;

import main.java.ExtinguishDevices.Cannon;
import main.java.FLF.PositionType;

public class GeneralPressureButton extends PressureButton implements ISpecialFeeler {

    public GeneralPressureButton(PositionType pos, Cannon cannon) {
        super(PositionType.frontop, cannon);
    }

    @Override
    public void release() {
        
    }

    @Override
    public void press() {
        
    }
    
}
