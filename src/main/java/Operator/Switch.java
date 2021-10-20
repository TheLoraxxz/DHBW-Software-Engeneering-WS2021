package main.java.Operator;

import main.java.Lights.Lights;

import java.util.HashMap;

public class Switch {

    private Lights[] lights;
    private SwitchType switchTypeOperation;

    Switch(SwitchType type, HashMap<SwitchType, Lights[]> lights) {
        this.switchTypeOperation = type;
        this.lights=lights.get(type);
    }
    public void on() {

    }

    public void off() {

    }
    public SwitchType getSwitchTypeOperation() {
        return switchTypeOperation;
    }
}
