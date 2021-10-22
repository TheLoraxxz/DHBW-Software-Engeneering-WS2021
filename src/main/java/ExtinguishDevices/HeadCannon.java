package main.java.ExtinguishDevices;

public class HeadCannon {

    private KnopRoofStepsType steps;
    private Segments[] segments;
    private MixDevice mixDevice;

    public HeadCannon(MixDevice mixing) {
        this.steps = KnopRoofStepsType.a;
        segments = new Segments[]{
                    new Segments(true),
                    new Segments(false)};
        this.mixDevice =mixing;
    }
}
