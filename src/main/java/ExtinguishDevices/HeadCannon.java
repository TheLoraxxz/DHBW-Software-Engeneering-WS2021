package main.java.ExtinguishDevices;

public class HeadCannon {

    private KnopRoofStepsType steps;
    private Segments[] segments;
    private MixType mixing;

    public HeadCannon() {
        this.steps = KnopRoofStepsType.a;
        segments = new Segments[]{
                    new Segments(true),
                    new Segments(false)};

    }
}
