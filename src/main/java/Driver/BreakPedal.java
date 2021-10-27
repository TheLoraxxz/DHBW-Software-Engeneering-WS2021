package main.java.Driver;

import main.java.Engine.ElectricMotor;
import main.java.Lights.BreakLight;

public class BreakPedal implements IPedal{
    private double speed;
    private ElectricMotor[] motors;
    private BreakLight[] lights;
    public BreakPedal(double speed, ElectricMotor[] motors,BreakLight[] lights) {
        this.speed = speed;
        this.motors = motors;
        this.lights = lights;
    }

    @Override
    public void press() {
        for (BreakLight breakLight : lights) {
            breakLight.on();
        }
        this.speed = speed-4;
        this.motors[0].consumeEnergy(speed);
        this.motors[1].consumeEnergy(speed);

        
    }

    @Override
    public void release() {
        for (BreakLight breakLight : lights) {
            breakLight.off();
        }        
    }
}
