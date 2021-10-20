package main.java.Operator;

import main.java.Engine.ElectricMotor;
import main.java.ExtinguishDevices.FrontCannon;
import main.java.ExtinguishDevices.HeadCannon;
import main.java.FLF.PositionType;
import main.java.Lights.Lights;
import main.java.Person.Operator;

import java.util.HashMap;

public class OperatorSection {

    final PositionType positionRelativeToControlPanel =PositionType.right;
    private ControlPanel panel;
    private Operator operator;

    public OperatorSection(FrontCannon front, HeadCannon head, HashMap<SwitchType, Lights[]> lights, ElectricMotor[] motor) {
        this.panel = new ControlPanel(front,head,lights,motor);
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
