package main.java.ExtinguishDevices;

public enum KnopRoofStepsType {
    a(500),
    b(1000),
    c(2500);
    private int value;
    private KnopRoofStepsType(int val) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
