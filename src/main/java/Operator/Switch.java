package main.java.Operator;

import main.java.Engine.ElectricMotor;
import main.java.Lights.Lights;

import java.util.HashMap;

public abstract class Switch {

    protected SwitchType switchTypeOperation;
    Switch(SwitchType type) {
        this.switchTypeOperation = type;
    }

    public abstract void on();

    public abstract void off();
    public SwitchType getSwitchTypeOperation() {
        return switchTypeOperation;
    }
}
