package main.java.FLF;

import main.java.Cabine.Cabine;

public class FLF {

    private long iteration;
    private double speed;
    private Cabine cabine;
    private Batteries[] batteries;
    private CentralUnit centralUnit;


    public FLF() {
        cabine = new Cabine();
        batteries = new Batteries[]{
                    new Batteries(),
                    new Batteries(),
                    new Batteries(),
                    new Batteries()};
        centralUnit = new CentralUnit();
    }
}
