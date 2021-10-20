package main.java.Operator;

import main.java.FLF.PositionType;
import main.java.Person.Operator;

public class OperatorSection {
    final PositionType positionRelativeToControlPanel =PositionType.right;
    private Operator operator;

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public PositionType getPositionRelativeToControlPanel() {
        return positionRelativeToControlPanel;
    }
}
