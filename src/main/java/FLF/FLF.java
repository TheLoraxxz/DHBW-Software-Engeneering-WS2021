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

        public Builder cabin()
        {
            cabin = new Cabin();
            return this;
        }

        public Builder centralUnit()
        {
            centralUnit = new CentralUnit();
            return this;
        }

        public Builder batteries()
        {
            batteries = new Batteries[]{
                    new Batteries(),
                    new Batteries(),
                    new Batteries(),
                    new Batteries()};
            return this;
        }

        public Builder speed()
        {
            speed = 0;
            return this;
        }

        public Builder iteration()
        {
            iteration = 0;
            return this;
        }

        public FLF build()
        {
            return new FLF(this);
        }
    }
}

