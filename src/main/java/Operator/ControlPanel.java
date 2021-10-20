package main.java.Operator;

import main.java.Engine.ElectricMotor;
import main.java.ExtinguishDevices.FrontCannon;
import main.java.ExtinguishDevices.HeadCannon;
import main.java.Lights.Lights;

import java.util.HashMap;

public class ControlPanel {
    LightSwitch[] switches;
    ElectroMotorSwitch motorSwitch;
    KnobFrontWaterCanon knobFront;
    KnobRoofWaterCanon knobRoof;

    ControlPanel(FrontCannon front, HeadCannon head, HashMap<SwitchType, Lights[]> lights, ElectricMotor[] motor) {
        this.knobFront = new KnobFrontWaterCanon(front);
        this.knobRoof = new KnobRoofWaterCanon(head);
        this.motorSwitch = new ElectroMotorSwitch(motor);
        this.switches = new LightSwitch[5];
        for (byte i=0;i<5;i++) {
            switch (i) {
                case 0->this.switches[i] = new LightSwitch(SwitchType.BlueLights,lights);
                case 1->this.switches[i] = new LightSwitch(SwitchType.SideLights,lights);
                case 2->this.switches[i] = new LightSwitch(SwitchType.warningLights,lights);
                case 3->this.switches[i] = new LightSwitch(SwitchType.headLightsFront,lights);
                case 4->this.switches[i] = new LightSwitch(SwitchType.headLightsRoof,lights);
            }
        }
    }
}
