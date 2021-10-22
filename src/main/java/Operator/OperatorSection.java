package main.java.Operator;

import main.java.Engine.ElectricMotor;
import main.java.ExtinguishDevices.FrontCannon;
import main.java.ExtinguishDevices.HeadCannon;
import main.java.ExtinguishDevices.MixDevice;
import main.java.FLF.PositionType;
import main.java.Lights.Lights;
import main.java.Person.Operator;

import java.util.HashMap;

public class OperatorSection {

    final PositionType positionRelativeToControlPanel =PositionType.right;
    private ControlPanel panel;
    private JoystickHeadCanon joystick;
    private Operator operator;

    public OperatorSection(FrontCannon front, HeadCannon head, HashMap<SwitchType, Lights[]> lights, ElectricMotor[] motor, MixDevice mixing) {
        this.panel = new ControlPanel(front,head,lights,motor);
        this.joystick = new JoystickHeadCanon(head,mixing);
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    public PositionType getPositionRelativeToControlPanel() {
        return positionRelativeToControlPanel;
    }
    public ControlPanel getPanel() {
        return panel;
    }
    public Operator getOperator() {
        return operator;
    }
}
