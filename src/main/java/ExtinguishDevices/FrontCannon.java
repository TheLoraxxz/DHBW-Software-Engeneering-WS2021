package main.java.ExtinguishDevices;

public class FrontCannon extends Cannon {
    private FrontWaterStepsType steps;
    private MixDevice mixDevice;
    public FrontCannon(MixDevice mix) {
        this.steps = FrontWaterStepsType.one;
        this.mixDevice = mix;
    }

    @Override
    public void pumpOut() {
        this.mixDevice.defill(steps.getValue());
    }

    public void setSteps(FrontWaterStepsType steps) {
        this.steps = steps;
    }
}
