package main.java.Person;

import main.java.ExtinguishDevices.FrontWaterStepsType;
import main.java.ExtinguishDevices.KnopRoofStepsType;
import main.java.Operator.OperatorSection;
import main.java.Operator.SwitchType;

public class Operator extends Person implements IOperator{
    OperatorSection operatorSection;
    @Override
    public void pressJoystickRight() {

    }

    @Override
    public void pressJoystickLeft() {

    }

    @Override
    public void pressFeeler() {

    }

    @Override
    public void tiltJoystick(int[] axis) {

    }

    @Override
    public void pressSwitch(SwitchType switchType) {

    }

    @Override
    public void changeHeadKnobToType(KnopRoofStepsType type) {

    }

    @Override
    public void changeFrontKnobToType(FrontWaterStepsType type) {

    }

    @Override
    public void sitDown(OperatorSection section) {
        this.operatorSection = section;
    }

    public void UseControlPanelLightSwitch(SwitchType switchType)
    {
        operatorSection.getPanel().getSwitches()[switchType].on();
    }
}
