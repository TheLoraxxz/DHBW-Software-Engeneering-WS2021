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
        switch (steps) {
            case one ->this.mixDevice.pumpOut((int) 500);
            case two ->this.mixDevice.pumpOut(1000);
            case three ->this.mixDevice.pumpOut(1500);
            case four ->this.mixDevice.pumpOut(2000);
            case five ->this.mixDevice.pumpOut(2500);
            case six ->this.mixDevice.pumpOut(3000);
            case seven ->this.mixDevice.pumpOut(3500);
        }

    }
}
