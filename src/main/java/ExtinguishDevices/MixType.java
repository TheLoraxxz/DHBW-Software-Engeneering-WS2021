package main.java.ExtinguishDevices;

public enum MixType {
    three(3),
    five(5),
    ten(10),
    zero(0);
    private int value;
    private MixType(int val) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
