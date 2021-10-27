package main.java.FLF;

public class Batteries {
    private double capacity;
    private Status status;

    public Batteries() {
        this.capacity = 100000;
        status = Status.idle;
    }
    public void turnOn() {
        status = Status.use;
    }
    public Status getStatus() {
        return status;
    }
    public void turnOf() {
        status = Status.idle;
    }
    public boolean consume(double amount) {
        if(amount<=capacity) {
            this.capacity = this.capacity-amount;
            return true;
        }
        return false;
    }
    public double getCapacity() {
        return this.capacity;
    }
}
