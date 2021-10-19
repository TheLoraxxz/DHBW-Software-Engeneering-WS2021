package main.java.Driver;

public class Driver implements IDriver{

    private DriverSection driverSection;

    @Override
    public void turnWheel(float degree) {
        driverSection.getSteeringWheel().turn(degree);
    }

    @Override
    public void pressGasPedal() {
        driverSection.getGasPedal().changeSpeed();
    }

    @Override
    public void pressBreakPedal() {
        driverSection.getBreakPedal().changeSpeed();
    }
}
