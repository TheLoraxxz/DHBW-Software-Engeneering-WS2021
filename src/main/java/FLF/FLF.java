package main.java.FLF;

import main.java.Cabine.Cabin;

public class FLF {

    private long iteration;
    private double speed;

    public Cabin getCabin() {
        return cabin;
    }

    private Cabin cabin;

    public Batteries[] getBatteries() {
        return batteries;
    }

    private Batteries[] batteries;

    public CentralUnit getCentralUnit() {
        return centralUnit;
    }

    private CentralUnit centralUnit;


    public FLF(Builder builder) {
        cabin = builder.cabin;
        centralUnit = builder.centralUnit;
        batteries = builder.batteries;
        speed = builder.speed;
        iteration = builder.iteration;
    }

    public static class Builder{
        private long iteration;
        private double speed;
        private Cabin cabin;
        private CentralUnit centralUnit;
        private Batteries[] batteries;

        public Builder()
        {
            cabin = new Cabin();
            centralUnit = new CentralUnit();
            batteries = new Batteries[]{
                    new Batteries(),
                    new Batteries(),
                    new Batteries(),
                    new Batteries()};
            speed = 0;
            iteration = 0;
        }

        public FLF build()
        {
            return new FLF(this);
        }
    }
}

