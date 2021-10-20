package main.java.Operator;

import main.java.ExtinguishDevices.ICannon;
import main.java.ExtinguishDevices.KnopRoofStepsType;

public interface IKnob {
    public void changeStep(KnopRoofStepsType step, ICannon canon);
}
