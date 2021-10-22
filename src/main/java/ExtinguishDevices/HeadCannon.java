package main.java.ExtinguishDevices;

public class HeadCannon {
    private KnopRoofStepsType steps;
    private Segments[] segments;

    public HeadCannon() {
        this.steps = KnopRoofStepsType.a;
        segments = new Segments[]{
                    new Segments(true),
                    new Segments(false)};
    }
}
