package main.java.Person;

import main.java.ExtinguishDevices.FrontWaterStepsType;
import main.java.ExtinguishDevices.KnopRoofStepsType;
import main.java.Operator.OperatorSection;
import main.java.Operator.SwitchType;

public class Operator extends Person implements IOperator{
    OperatorSection operatorSection;
    @Override
    public void pressJoystickRight() {
        if(this.operatorSection!=null) {
            this.operatorSection.getJoystick().getPressureButtons()[1].press();
        }
        
    }

    @Override
    public void pressJoystickLeft() {
        if(this.operatorSection!=null) {
            this.operatorSection.getJoystick().getPressureButtons()[0].press();
        }
        
    }

    @Override
    public void pressFeeler() {
        if(this.operatorSection!= null) {
            this.operatorSection.getJoystick().getFeeler().press();
        }
    }

    @Override
    public void tiltJoystick(int[] axis) {
        //The_Loraxxz komplex aufgabe :D :O
    }

    @Override
    public void pressSwitch(SwitchType switchType) {
        if(this.operatorSection!=null) {
            if(switchType==SwitchType.electroMotor) {
                if(this.operatorSection.getPanel().getMotorSwitch().isOn()) {
                    this.operatorSection.getPanel().getMotorSwitch().off();
                } else {
                    this.operatorSection.getPanel().getMotorSwitch().on();
                }
            } else {
                if(this.operatorSection.getPanel().getLightSwitches()[switchType.getValue()].isOn()) {
                    this.operatorSection.getPanel().getLightSwitches()[switchType.getValue()].off();
                } else {
                    this.operatorSection.getPanel().getLightSwitches()[switchType.getValue()].on();
                }
                
            }
        }
    }

    @Override
    public void changeHeadKnobToType(KnopRoofStepsType type) {
        if(this.operatorSection!= null) {
            this.operatorSection.getPanel().getKnobRoof().changeStep(type);
        }
    }

    @Override
    public void changeFrontKnobToType(FrontWaterStepsType type) {
        if(operatorSection!=null) {
            this.operatorSection.getPanel().getKnobFront().changeStep(type);
        }
        
    }

    @Override
    public void sitDown(OperatorSection section) {
        this.operatorSection = section;
    }
}
