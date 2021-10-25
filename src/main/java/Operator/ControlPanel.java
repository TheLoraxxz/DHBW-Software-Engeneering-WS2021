package main.java.Operator;

import main.java.Engine.ElectricMotor;
import main.java.ExtinguishDevices.FrontCannon;
import main.java.ExtinguishDevices.HeadCannon;
import main.java.Lights.Lights;

import java.util.HashMap;

public class ControlPanel {

    public Lights[] getSwitches(SwitchType switchType) {
        return switches.get(switchType);
    }

    private HashMap<SwitchType, Lights[]> switches;

    public ElectroMotorSwitch getMotorSwitch() {
        return motorSwitch;
    }

    private ElectroMotorSwitch motorSwitch;

    public KnobFrontWaterCanon getKnobFront() {
        return knobFront;
    }

    private KnobFrontWaterCanon knobFront;

    public KnobRoofWaterCanon getKnobRoof() {
        return knobRoof;
    }

    private KnobRoofWaterCanon knobRoof;

    ControlPanel(FrontCannon front, HeadCannon head, HashMap<SwitchType, Lights[]> lights, ElectricMotor[] motor) {
        this.knobFront = new KnobFrontWaterCanon(front);
        this.knobRoof = new KnobRoofWaterCanon(head);
        this.motorSwitch = new ElectroMotorSwitch(motor);
        this.switches = lights;
    }
}
