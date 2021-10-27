package main.java.Cabine;

import main.java.FLF.PositionType;

public class BusDoor {
    private boolean isOpen;
    private PositionType position;
    private DoorFeeler[] doorFeelers;

    public BusDoor(PositionType position,Seat[] seats) {
        this.position = position;
        isOpen = false;
        doorFeelers = new DoorFeeler[]{new DoorFeeler(isOpen,true,seats),new DoorFeeler(isOpen,false,seats)};
    }

    public DoorFeeler[] getDoorFeelers() {
        return doorFeelers;
    }
    public PositionType getPositionType() {
        return position;
    }

}
