package main.java.FLF;

import main.java.Cabine.Cabin;

public class FLF {

    private CentralUnit centralUnit;
    private Cabin cabin;
    private Box box;

    public Cabin getCabin() {
        return cabin;
    }


    public Box getBatteries() {
        return box;
    }


    public CentralUnit getCentralUnit() {
        return centralUnit;
    }

    public FLF(Builder builder) {
        cabin = builder.cabin;
        centralUnit = builder.centralUnit;
        box = builder.batteries;
    }

    public static class Builder{
        private Cabin cabin;
        private CentralUnit centralUnit;
        private Box batteries;
        private static JoystickType types = JoystickType.seperate;
        public Builder() {
            batteries = new Box();
            centralUnit = new CentralUnit(batteries,types);
            cabin = new Cabin(centralUnit.getDriverSection(),centralUnit.getOperatorSection(),batteries,this.centralUnit.getPivotsStatic());
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

