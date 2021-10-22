package main.java.ExtinguishDevices;

public class WaterTank extends Tank{
    public WaterTank(){
        this.capacity = 25*10*50;
    }

    @Override
    public void fill(int amount) {

    }

    @Override
    public void defill(int amount) {
        if (amount>0&&this.capacity>=amount) {
            this.capacity = this.capacity-amount;
        }

    }
}
