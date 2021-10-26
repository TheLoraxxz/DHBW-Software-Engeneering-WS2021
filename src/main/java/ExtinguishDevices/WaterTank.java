package main.java.ExtinguishDevices;

public class WaterTank extends Tank{

    public WaterTank() {
        this.capacity =12500;
    }

    @Override
    public void fill(float amount) {
        if(amount+this.capacity>=12500) {
            this.capacity = 12500;
        } else {
            this.capacity = this.capacity +amount;
        }
    }
}
