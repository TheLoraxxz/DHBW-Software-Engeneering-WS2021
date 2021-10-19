package main.java.FLF;

import main.java.Driver.DriverSection;
import main.java.Engine.Pivot;
import main.java.Engine.PivotStatic;
import main.java.Engine.PivotTurnable;
import main.java.ExtinguishDevices.FrontCannon;
import main.java.ExtinguishDevices.HeadCannon;
import main.java.Operator.OperatorSection;

public class CentralUnit {
    private FLF flf;

    public DriverSection getDriverSection() {
        return driverSection;
    }

    private DriverSection driverSection;

    public OperatorSection getOperatorSection() {
        return operatorSection;
    }

    private OperatorSection operatorSection;

    public HeadCannon getHeadCannon() {
        return headCannon;
    }

    /*
        public WarningLights[] getWarningLights() {
            return warningLights;
        }

        private WarningLights[] warningLights;

        public HeadLights[] getHeadLights() {
            return headLights;
        }

        private HeadLights[] headLights;

        public BlueLights[] getBlueLights() {
            return blueLights;
        }
        //haette die verschiedenen lichter in einem Array gespeichert und dann nach anzahl die initialisierungswert geaendert
        private BlueLights[] blueLights;

        public TurnSignalLights[] getTurnSignalLights() {
            return turnSignalLights;
        }

        private TurnSignalLights[] turnSignalLights;

        public BreakLights[] getBreakLights() {
            return breakLights;
        }

        private BreakLights[] breakLights;*/
    private HeadCannon headCannon;

    public FrontCannon getFrontCannon() {
        return frontCannon;
    }

    private FrontCannon frontCannon;

    public PivotStatic[] getPivotsStatic() {
        return pivotsStatic;
    }

    private PivotStatic[] pivotsStatic;

    public PivotTurnable[] getPivotsTurnable() {
        return pivotsTurnable;
    }

    private PivotTurnable[] pivotsTurnable;

}
