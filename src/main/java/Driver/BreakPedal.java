package main.java.Driver;

import main.java.Engine.ElectricMotor;

public class BreakPedal implements IPedal{
    private double speed;
    private ElectricMotor[] motors;
    public BreakPedal(double speed, ElectricMotor[] motors) {
        this.speed = speed;
        this.motors = motors;
    }

    @Override
    public void changeSpeed() {
        this.speed = speed-4;
        this.motors[0].consumeEnergy(speed);
        this.motors[1].consumeEnergy(speed);
    }
}
