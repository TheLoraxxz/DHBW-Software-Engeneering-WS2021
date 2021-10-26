package main.java.ExtinguishDevices;

public class FoamTank extends Tank{

    public FoamTank() {
        this.capacity = 2500;
    }

    @Override
    public void fill(float amount) {
        if(amount+this.capacity>=2500) {
            this.capacity = 2500;
        } else {
            this.capacity = this.capacity +amount;
        }
    }
}
