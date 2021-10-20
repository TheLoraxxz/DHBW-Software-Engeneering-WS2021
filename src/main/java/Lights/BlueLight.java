package main.java.Lights;

import main.java.FLF.PositionType;

public class BlueLight extends Lights{
    private LED[] leds;

    BlueLight(PositionType pos,int ledNumber) {
        this.position = pos;
        this.leds = new LED[ledNumber];
    }

    public LED[] getLeds() {
        return leds;
    }
}
