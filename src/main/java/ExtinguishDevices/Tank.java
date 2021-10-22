package main.java.ExtinguishDevices;

public abstract class Tank {
    protected int capacity;

    public abstract void fill(int amount);
    public abstract void defill(int amount);
}
