package main.java.Operator;

import main.java.Lights.Lights;

import java.util.HashMap;

public class LightSwitch extends Switch {

    Lights[] lights;

    LightSwitch(SwitchType type, HashMap<SwitchType,Lights[]> lights) {
        super(type);
        this.lights = lights.get(type);
    }
}
