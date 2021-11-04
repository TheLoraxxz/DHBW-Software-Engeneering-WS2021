package main.java.ExtinguishDevices;

public abstract class Tank {
    public float getCapacity() {
        return capacity;
    }

    protected float capacity;

    public abstract void fill(float amount);
    public float defill(float foamV) {
        if(foamV>=this.capacity) {
            float cap = this.capacity;
            this.capacity = 0;
            return cap;
        } else {
            this.capacity = this.capacity-foamV;
            return foamV;
        }
    }
}
