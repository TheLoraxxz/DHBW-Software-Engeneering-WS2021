package main.java.ExtinguishDevices;

public class HeadCannon extends Cannon{

    private KnopRoofStepsType steps;
    private Segments[] segments;

    private MixDevice mixDevice;

    public HeadCannon(MixDevice mixing) {
        super();
        this.steps = KnopRoofStepsType.a;
        segments = new Segments[]{
                    new Segments(true),
                    new Segments(false)};
        this.mixDevice =mixing;
    }

    public KnopRoofStepsType getSteps() {
        return steps;
    }

    public MixDevice getMixDevice() {
        return mixDevice;
    }

    public void setSteps(KnopRoofStepsType steps) {
        this.steps = steps;
    }

    @Override
    public void pumpOut() {
        this.mixDevice.defill(this.steps.getValue());
    }

    public void setCannonState(CannonState cannonState) {
        if (cannonState==CannonState.active) {
            this.segments[0].setTiltDegree(90);
            for (PartSegments segment:this.segments[1].getPartSegments()) {
                segment.moveOut();
            }
        } else {
            for (PartSegments segment:this.segments[1].getPartSegments()) {
                segment.movIn();
            }
            this.segments[0].setTiltDegree(0);
        }
        this.cannonState = cannonState;
    }

}
