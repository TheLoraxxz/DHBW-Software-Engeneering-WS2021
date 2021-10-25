package main.java.ExtinguishDevices;

public class FrontCannon {
    private FrontWaterStepsType steps;
    private MixDevice mixDevice;
    public FrontCannon(MixDevice mixer) {
        this.steps = FrontWaterStepsType.one;
        this.mixDevice = mixer;
    }
}