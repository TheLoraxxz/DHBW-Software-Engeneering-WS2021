package main.java.Lights;

import main.java.FLF.PositionType;

public class WarningLight extends Lights{
    private LED led;
    public WarningLight(PositionType pos) {
        this.position = pos;
        this.led = new LED();
    }

}
