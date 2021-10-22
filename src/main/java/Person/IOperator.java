package main.java.Person;

import main.java.ExtinguishDevices.FrontWaterStepsType;
import main.java.ExtinguishDevices.KnopRoofStepsType;
import main.java.Operator.OperatorSection;
import main.java.Operator.SwitchType;

public interface IOperator extends IFLFOperator{
    public void pressSwitch(SwitchType switchType);
    public void changeHeadKnobToType(KnopRoofStepsType type);
    public void changeFrontKnobToType(FrontWaterStepsType type);
    public void sitDown(OperatorSection section);

}
