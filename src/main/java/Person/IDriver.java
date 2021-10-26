package main.java.Person;

import main.java.Driver.DriverSection;

public interface IDriver extends IFLFOperator{
    public void turnWheel(float degree);
    public void sitDown(DriverSection section);
    public void pressGasPedal();
    public void pressBreakPedal();
}
