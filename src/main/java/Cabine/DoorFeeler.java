package main.java.Cabine;

import main.java.Joystick.IFeeler;

public class DoorFeeler implements IFeeler{
    private boolean isOpen;
    public DoorFeeler(boolean open) {
        isOpen = open;
    }
    @Override
    public void press() {
        isOpen = !isOpen;
        
    }
}
