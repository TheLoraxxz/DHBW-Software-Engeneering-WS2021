package main.java.ExtinguishDevices;

public class Segments {
    private boolean canTilt;
    private PartSegments[] partSegments;
    private float tiltDegree;
    public Segments(boolean canTilt) {
        this.tiltDegree = 0;
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
    public void setTiltDegree(float tilt) {
        this.tiltDegree = tilt;
    }
    public PartSegments[] getPartSegments() {
        if(this.canTilt) {
            return this.partSegments;
        }
        return null;
    }
    
    public float getTiltDegree() {
        return tiltDegree;
    }
}
