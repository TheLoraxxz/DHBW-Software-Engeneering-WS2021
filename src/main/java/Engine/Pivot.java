package main.java.Engine;

public abstract class Pivot {
    public BreakDisk[] getBreakDisks() {
        return breakDisks;
    }

    private BreakDisk[] breakDisks;

    public Wheel[] getWheels() {
        return wheels;
    }

    private Wheel[] wheels;


    public Pivot() {
        breakDisks = new BreakDisk[6];
        for (int i = 0; i<6; i++)
        {
            breakDisks[i] = new BreakDisk();
        }
        wheels = new Wheel[]{new Wheel(),new Wheel()};
    }
}
