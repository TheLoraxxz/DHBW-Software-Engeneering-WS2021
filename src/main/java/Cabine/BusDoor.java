package main.java.Cabine;

import main.java.FLF.PositionType;

public class BusDoor {
    private boolean isOpen;
    private PositionType position;
    private DoorFeeler[] doorFeelers;

    public BusDoor(PositionType position,Seat[] seats) {
        this.position = position;
        isOpen = false;
        doorFeelers = new DoorFeeler[]{new DoorFeeler(this,true,seats),new DoorFeeler(this,false,seats)};
    }

    public DoorFeeler[] getDoorFeelers() {
        return doorFeelers;
    }
    public PositionType getPositionType() {
        return position;
    }
    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
    public boolean isOpen() {
        return isOpen;
    }

}
