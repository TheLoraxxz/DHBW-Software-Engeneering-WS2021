package main.java.FLF;

import main.java.Cabine.Cabin;

public class FLF {

    private double speed;

    private CentralUnit centralUnit;
    private Cabin cabin;
    private Batteries[] batteries;

    public Cabin getCabin() {
        return cabin;
    }


    public Batteries[] getBatteries() {
        return batteries;
    }


    public CentralUnit getCentralUnit() {
        return centralUnit;
    }

    public double getSpeed() {
        return speed;
    }

    public FLF(Builder builder) {
        cabin = builder.cabin;
        centralUnit = builder.centralUnit;
        batteries = builder.batteries;
        speed = builder.speed;
    }

    public static class Builder{
        private double speed;
        private Cabin cabin;
        private CentralUnit centralUnit;
        private Batteries[] batteries;
        private static JoystickType types = JoystickType.seperate;
        public Builder() {
            batteries = new Batteries[]{
                    new Batteries(),
                    new Batteries(),
                    new Batteries(),
                    new Batteries()};
            speed = 0;
            centralUnit = new CentralUnit(this.speed,batteries,types);
            cabin = new Cabin(centralUnit.getDriverSection(),centralUnit.getOperatorSection(),batteries,speed);
        }
        public static void setJoystickType(JoystickType type) {
            types = type;
        }
        public FLF build()
        {
            return new FLF(this);
        }
    }
}

