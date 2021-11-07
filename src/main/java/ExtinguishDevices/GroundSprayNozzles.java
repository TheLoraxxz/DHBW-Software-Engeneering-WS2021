package main.java.ExtinguishDevices;

public class GroundSprayNozzles extends Cannon {
    private WaterTank waterTank;
    public GroundSprayNozzles(WaterTank tank) {
        super();
        this.waterTank = tank;
    }
    @Override
    public void pumpOut() {
        if(this.cannonState == CannonState.throwingExtinguishMedium) {
            this.waterTank.defill(100);
        }
        
    }

    @Override
    public void setCannonState(CannonState cannonState) {
        if(cannonState==CannonState.inactive) {
            this.cannonState = CannonState.throwingExtinguishMedium;
        } else {
            this.cannonState =CannonState.inactive;
        }
    }
}
