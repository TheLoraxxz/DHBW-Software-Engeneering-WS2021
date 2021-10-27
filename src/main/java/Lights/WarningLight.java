package main.java.Lights;

import main.java.FLF.PositionType;

public class WarningLight extends Lights{
    private LED led;
    public WarningLight(PositionType pos) {
        super();
        this.position = pos;
        this.led = new LED();
    }
    public LED getLed() {
        return led;
    }

}
