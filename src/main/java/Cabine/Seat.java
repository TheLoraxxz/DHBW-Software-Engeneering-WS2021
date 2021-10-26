package main.java.Cabine;

import java.sql.Driver;
import java.util.concurrent.ExecutionException;

import main.java.Driver.DriverSection;
import main.java.FLF.PositionType;
import main.java.Operator.OperatorSection;
import main.java.Person.Operator;
import main.java.Person.Person;

public class Seat {
    private PositionType position;
    private Person person;
    private Respirators respirators;

    private OperatorSection operator;
    private DriverSection driver;

    public Seat(PositionType position) {
        this.position = position;
        respirators = new Respirators();
    }

    public Seat(PositionType position,OperatorSection section) {
        this.position = position;
        respirators = new Respirators();
    }
    public Seat(PositionType position,DriverSection section) {
        this.position = position;
        respirators = new Respirators();
    }
    public Respirators getRespirators() {
        return respirators;
    }


    public Person getPerson() {
        return person;
    }

    public boolean setPerson(Person person) {
        if (this.person == null) {
            if (this.driver!=null && person instanceof Driver) {
                    Driver driverP = (Driver) person;
                    this.person = person;

            }
            if(this.operator!=null&&person instanceof Operator) {
                Operator operatorP = (Operator) person;
                operatorP.sitDown(operator);
                this.person = person;
            }
        }
        return true;

    }
}
