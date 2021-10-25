package main.java.ExtinguishDevices;

public class Segments {
    private boolean canTilt;
    private PartSegments[] partSegments;

    public Segments(boolean canTilt) {
        this.canTilt = canTilt;
        if(canTilt)
        {
            partSegments = new PartSegments[]{
                    new PartSegments(6),new PartSegments(6), new PartSegments(5)
            };
        }
        else
        {
            partSegments = null;
        }
    }
}
