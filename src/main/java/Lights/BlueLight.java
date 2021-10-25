package main.java.Lights;

import main.java.FLF.PositionType;

public class BlueLight extends Lights{
    private LED[] leds;

    public BlueLight(PositionType pos, int ledNumber) {
        super();
        this.position = pos;
        this.leds = new LED[ledNumber];
    }

    public LED[] getLeds() {
        return leds;
    }

    @Override
    public void on() {

    }
}
