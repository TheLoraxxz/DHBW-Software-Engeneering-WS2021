package main.java.Driver;

import main.java.Engine.ElectricMotor;
import main.java.Engine.Pivot;
import main.java.Lights.BreakLight;

public class BreakPedal implements IPedal{
    private Pivot pivot;
    private ElectricMotor[] motors;
    private BreakLight[] lights;
    public BreakPedal(Pivot pivot, ElectricMotor[] motors,BreakLight[] lights) {
        this.pivot = pivot;
        this.motors = motors;
        this.lights = lights;
    }

    @Override
    public void press() {
        for (BreakLight breakLight : lights) {
            breakLight.on();
        }
        this.pivot.setSpeed(this.pivot.getSpeed()-4);
        this.motors[0].changeSpeed(this.pivot.getSpeed());
        this.motors[1].changeSpeed(this.pivot.getSpeed());

        
    }

    @Override
    public void release() {
        for (BreakLight breakLight : lights) {
            breakLight.off();
        }
        this.motors[0].changeSpeed(this.pivot.getSpeed());
        this.motors[1].changeSpeed(this.pivot.getSpeed());          
    }
}
