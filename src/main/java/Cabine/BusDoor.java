package main.java.Cabine;

public class BusDoor {
    private boolean isOpen;

    public BusDoor() {
        isOpen = false;
        doorFeelers = new DoorFeeler[]{new DoorFeeler(),new DoorFeeler()};
    }

    public DoorFeeler[] getDoorFeelers() {
        return doorFeelers;
    }

    private DoorFeeler[] doorFeelers;
}
