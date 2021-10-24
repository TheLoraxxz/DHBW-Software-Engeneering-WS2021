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

    public void setToNextMix() {
        switch (mixType) {
            case zero -> this.mixType = MixType.three;
            case three -> this.mixType = MixType.five;
            case five -> this.mixType = MixType.ten;
            case ten -> this.mixType = MixType.zero;
        }
    }

    public void defill(int amount) {
        int foam = amount/100*(mixType.getValue());
        int water = amount-foam;
        this.water.defill(water);
        this.foam.defill(foam);
    }

    public MixType getMixType() {
        return mixType;
    }

}
