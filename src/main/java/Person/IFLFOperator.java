package main.java.Person;

import main.java.FLF.PositionType;

public interface IFLFOperator {
    public void pressJoystickRight();
    public void pressJoystickLeft();
    public void pressFeeler();
    public void tiltJoystick(int[] axis);
}
