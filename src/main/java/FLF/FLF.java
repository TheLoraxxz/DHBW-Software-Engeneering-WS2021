package main.java.FLF;

import main.java.Cabine.Cabine;

public class FLF {

    private long iteration;
    private double speed;

    public Cabine getCabine() {
        return cabine;
    }

    private Cabine cabine;

    public Batteries[] getBatteries() {
        return batteries;
    }

    private Batteries[] batteries;

    public CentralUnit getCentralUnit() {
        return centralUnit;
    }

    private CentralUnit centralUnit;


    public FLF() {
        cabine = new Cabine(this);
        batteries = new Batteries[]{
                    new Batteries(),
                    new Batteries(),
                    new Batteries(),
                    new Batteries()};
        centralUnit = new CentralUnit(this);
    }
}
