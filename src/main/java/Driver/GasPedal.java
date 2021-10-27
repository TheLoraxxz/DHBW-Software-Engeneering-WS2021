package main.java.Driver;

import main.java.Engine.ElectricMotor;

public class GasPedal implements IPedal{

    private double speed;
    private ElectricMotor[] motors;

    public GasPedal(double speed, ElectricMotor[] motors) {

    }
    @Override
    public void press() {
        this.speed = speed+4;
        this.motors[0].consumeEnergy(speed);
        this.motors[1].consumeEnergy(speed);
    }
    @Override
    public void release() {        
    }
}
