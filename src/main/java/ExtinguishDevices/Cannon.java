package main.java.ExtinguishDevices;

public abstract class Cannon {



    protected CannonState cannonState;

    Cannon() {
        this.cannonState = CannonState.inactive;
    }

    public abstract void pumpOut();

    public CannonState getCannonState() {
        return cannonState;
    }
}
