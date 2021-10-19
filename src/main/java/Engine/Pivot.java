package main.java.Engine;

public abstract class Pivot {
    private BreakDisk[] breakDisks;
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
