package main.java.Operator;

import main.java.ExtinguishDevices.FrontCannon;
import main.java.ExtinguishDevices.FrontWaterStepsType;
import main.java.ExtinguishDevices.KnopRoofStepsType;

public class KnobFrontWaterCanon{

    private FrontCannon canon;

    KnobFrontWaterCanon(FrontCannon frontCannon) {
            this.canon = frontCannon;
    }

    public void changeStep(FrontWaterStepsType step) {
        this.canon.setSteps(step);
    }
}
