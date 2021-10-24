package main.java.ExtinguishDevices;

public class WaterTank extends Tank {
    public WaterTank() {
        this.capacity = 25 * 10 * 50;
    }

    @Override
    public void fill(int amount) {
        if (amount <= this.capacity) {
            this.capacity = this.capacity + amount;
        } else {
            this.capacity=25*10*50;
        }
    }
}
