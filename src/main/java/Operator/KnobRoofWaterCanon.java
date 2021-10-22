package main.java.Operator;

import main.java.ExtinguishDevices.HeadCannon;
import main.java.ExtinguishDevices.KnopRoofStepsType;

public class KnobRoofWaterCanon implements IKnob{

    private HeadCannon canon;

    KnobRoofWaterCanon(HeadCannon canon) {
        this.canon = canon;
    }

    @Override
    public void changeStep(KnopRoofStepsType step) {

    }
}
