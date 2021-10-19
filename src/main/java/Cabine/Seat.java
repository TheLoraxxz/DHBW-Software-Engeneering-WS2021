package main.java.Cabine;

import main.java.FLF.PositionType;
import main.java.Person.Person;

public class Seat {
    private PositionType position;
    private Respirators respirators;
    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }
}
