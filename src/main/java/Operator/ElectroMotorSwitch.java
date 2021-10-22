package main.java.Operator;

import main.java.Engine.ElectricMotor;

public class ElectroMotorSwitch extends Switch{
    private ElectricMotor[] motor;
    ElectroMotorSwitch(ElectricMotor[] motor) {
        super(SwitchType.electroMotor);
        this.motor = motor;
    }
    @Override
    public void on() {

    }

    @Override
    public void off() {

    }
}
