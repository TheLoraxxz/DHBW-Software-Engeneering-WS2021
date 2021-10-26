package main.java.Cabine;

public class SpeedDisplay implements IDisplay{
    private double speed;
    public SpeedDisplay(double speed) {
        this.speed = speed;
    }
    @Override
    public String show() {
        
        return speed+"km/h";
    }
}
