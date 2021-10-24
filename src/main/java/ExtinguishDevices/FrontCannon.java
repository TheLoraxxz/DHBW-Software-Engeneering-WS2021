package main.java.ExtinguishDevices;

public class FrontCannon extends Cannon {
    private FrontWaterStepsType steps;
    private float tiltDegree;
    private MixDevice mixDevice;
    public FrontCannon(MixDevice mix) {
        this.tiltDegree = 0;
        this.steps = FrontWaterStepsType.one;
        this.mixDevice = mix;
    }

    @Override
    public void pumpOut() {
        this.mixDevice.defill(steps.getValue());
    }
    public MixDevice getMixDevice() {
        return mixDevice;
    }

    public void setCannonState(CannonState cannonState) {
        if (cannonState==CannonState.active) {
            tiltDegree = 90;
        } else {
            tiltDegree =0;
        }
        this.cannonState = cannonState;
    }
    public void setSteps(FrontWaterStepsType steps) {
        this.steps = steps;
    }
}
