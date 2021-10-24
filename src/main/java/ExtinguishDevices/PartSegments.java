package main.java.ExtinguishDevices;

public class PartSegments {

    private int lenght;
    private int shownLength;


    public PartSegments(int lenght) {
        this.lenght = lenght;
    }


    public void moveOut() {
        this.shownLength=lenght;
    }
    public void movIn() {
        this.shownLength=0;
    }


    public int getLenght() {
        return lenght;
    }

    public int getShownLength() {
        return shownLength;
    }
}
