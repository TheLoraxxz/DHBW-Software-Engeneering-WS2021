package main.java.Cabine;

import main.java.Person.Person;

public class DoorFeeler implements IDoorFeeler{
    private boolean isOpen;
    private boolean isInside;
    private Seat[] seats;
    public DoorFeeler(boolean open,boolean position,Seat[] seats) {
        this.isInside = position;
        isOpen = open;
        this.seats = seats;
    }
    @Override
    public void press(Person person) {
        if(!isInside) {
            isOpen = !isOpen;
        } else {
            if(seats.equals(person)) {
                isOpen = !isOpen;
            }
        }
        
        
    }
}
