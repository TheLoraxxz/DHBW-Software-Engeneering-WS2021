package main.java.Person;

import main.java.Driver.DriverSection;

public class Driver extends FLFOperator{
    public DriverSection getSection() {
        return section;
    }

    private DriverSection section;

    public void turnWheel(float degree) {
        if(this.section!=null) {
            this.section.getSteeringWheel().turn(degree);
        }
    }

    public void pressGasPedal() {
        if(this.section!=null) {
            this.section.getGasPedal().press();
        }
    }
    public void releaseGasPedal() {
        if(this.section!=null) {
            this.section.getBreakPedal().release();
        }
    }

    public void pressBreakPedal() {
        if(this.section!=null) {
            this.section.getBreakPedal().press();
        }
    }

    public void releaseBreakPedal() {
        if(this.section!=null) {
            this.section.getBreakPedal().release();
        }
        
    }

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
