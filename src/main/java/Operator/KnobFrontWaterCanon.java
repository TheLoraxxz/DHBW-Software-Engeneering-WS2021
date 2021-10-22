package main.java.Operator;

import main.java.ExtinguishDevices.FrontCannon;
import main.java.ExtinguishDevices.KnopRoofStepsType;

public class KnobFrontWaterCanon implements IKnob{

    private FrontCannon canon;

    KnobFrontWaterCanon(FrontCannon frontCannon) {
            this.canon = frontCannon;
    }

    @Override
    public void changeStep(KnopRoofStepsType step) {

    }
}
