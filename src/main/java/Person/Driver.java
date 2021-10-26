package main.java.Person;

import main.java.Driver.DriverSection;

public class Driver extends Person implements IDriver{
    private DriverSection section;
    @Override
    public void turnWheel(float degree) {
        if(this.section!=null) {
            this.section.getSteeringWheel().turn(degree);
        }
    }

    @Override
    public void pressGasPedal() {
        if(this.section!=null) {
            this.section.getGasPedal().changeSpeed();
        }
    }

    @Override
    public void pressBreakPedal() {
        if(this.section!=null) {
            this.section.getBreakPedal().changeSpeed();
        }
    }

    @Override
    public void sitDown(DriverSection section) {
        this.section = section;
    }

    @Override
    public void pressJoystickRight() {
        if(this.section!=null) {
            this.section.getJoystickFrontCannon().getPressureButtons()[1].press();
        }
    }

    @Override
    public void pressJoystickLeft() {
        if(this.section!=null) {
            this.section.getJoystickFrontCannon().getPressureButtons()[0].press();
        }
    }

    @Override
    public void pressFeeler() {
        if(this.section!=null) {
            this.section.getJoystickFrontCannon().getFeeler().press();
        }
    }

    @Override
    public void tiltJoystick(int[] axis) {

    }
}
