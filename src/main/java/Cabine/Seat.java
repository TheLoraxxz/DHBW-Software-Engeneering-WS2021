package main.java.Cabine;

import main.java.FLF.PositionType;
import main.java.Person.Person;

public class Seat {
    private PositionType position;

    public Seat(PositionType position) {
        this.position = position;
        respirators = new Respirators();
    }

    public Respirators getRespirators() {
        return respirators;
    }

    private Respirators respirators;

    public Person getPerson() {
        return person;
    }

    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }
}
