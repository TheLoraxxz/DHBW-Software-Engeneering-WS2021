package main.java.FLF;

public class Battery {
    private double capacity;

    public Battery() {
        this.capacity = 100000;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }


    public double getCapacity() {
        return this.capacity;
    }
}
