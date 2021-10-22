package main.java.ExtinguishDevices;

public class FrontCannon extends Cannon {
    private FrontWaterStepsType steps;
    private MixDevice mixDevice;
    public FrontCannon(MixDevice mixer) {
        this.steps = FrontWaterStepsType.one;
        this.mixDevice = mixer;
    }

    @Override
    public void pumpOut() {

    }
}
