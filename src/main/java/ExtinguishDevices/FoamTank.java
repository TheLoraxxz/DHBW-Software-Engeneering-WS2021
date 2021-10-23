package main.java.ExtinguishDevices;

public class FoamTank extends Tank{
    public FoamTank() {
        this.capacity = 2500;
    }

    @Override
    public void fill(int amount) {
        if (amount <= this.capacity) {
            this.capacity = this.capacity + amount;
        } else {
            this.capacity=2500;
        }
    }
}
