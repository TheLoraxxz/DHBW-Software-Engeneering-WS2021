package main.java.ExtinguishDevices;

public abstract class Tank {
    protected int capacity;

    public abstract void fill(int amount);
    public int defill(int amount) {
        if (amount>0&&this.capacity>=amount) {
            this.capacity = this.capacity-amount;
            return amount;
        } else {
            if(amount>=this.capacity) {
                this.capacity=0;
                return amount-this.capacity;
            }
            return 0;
        }
    }
}
