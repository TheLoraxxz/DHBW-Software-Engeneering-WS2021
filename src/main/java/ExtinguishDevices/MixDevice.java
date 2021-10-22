package main.java.ExtinguishDevices;

public class MixDevice {
    private MixType mixType;

    public MixDevice() {
        this.mixType = MixType.zero;
    }

    public void setMixType(MixType mixType) {
        this.mixType = mixType;
    }
}
