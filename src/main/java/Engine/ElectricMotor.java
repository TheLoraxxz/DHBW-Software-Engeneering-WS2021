package main.java.Engine;

import main.java.FLF.Batteries;
import main.java.FLF.Status;

public class ElectricMotor {
    private Batteries[] battery;
    
    public ElectricMotor(Batteries[] battery) {
        this.battery = battery;
    }

    public void consumeEnergy(double speed) {
        try {
            for (Batteries batteries : battery) {
                if (batteries.getStatus() == Status.use) {
                    double amountPerBattery = 12.5 * speed / 4;
                    if (!batteries.consume(amountPerBattery)) {
                        throw new Exception("Batteries empty!");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setOn(boolean on) {
        for (Batteries batteries : battery) {
            batteries.turnOn();
        }
    }

    public boolean isOn() {
        return battery[0].getStatus() == Status.use;
    }
}
