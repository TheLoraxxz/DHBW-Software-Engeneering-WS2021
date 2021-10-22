package main.java.ExtinguishDevices;

public class MixDevice {

    private WaterTank water;
    private FoamTank foam;
    private MixType mixType;

    public MixDevice(WaterTank tank1, FoamTank tank2) {
        this.mixType = MixType.zero;
        this.water = tank1;
        this.foam = tank2;
    }

    public void setMixType(MixType mixType) {
        this.mixType = mixType;
    }

    public MixType getMixType() {
        return mixType;
    }
}
