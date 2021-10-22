package main.java.FLF;

import main.java.Driver.DriverSection;
import main.java.Engine.ElectricMotor;
import main.java.Engine.PivotStatic;
import main.java.Engine.PivotTurnable;
import main.java.ExtinguishDevices.FrontCannon;
import main.java.ExtinguishDevices.HeadCannon;
import main.java.ExtinguishDevices.MixDevice;
import main.java.Lights.*;
import main.java.Operator.OperatorSection;
import main.java.Operator.SwitchType;

import java.util.HashMap;

public class CentralUnit {
    private HashMap<SwitchType,Lights[]> lights;

    ElectricMotor[] motors;

    private BreakLight breakLight[];
    private TurnSignalLight turnSignalLight[];

    public CentralUnit() {
        this.lights = new HashMap<>();
        this.lights.put(SwitchType.SideLights,new Lights[10]); //creating the ten side Lights
        this.lights.put(SwitchType.headLightsFront,new Lights[6]); // creating the 6 front lights
        this.lights.put(SwitchType.headLightsRoof,new Lights[4]); //4 roof lights roof
        this.lights.put(SwitchType.BlueLights,new Lights[10]);
        this.lights.put(SwitchType.warningLights,new Lights[2]);
        for (int i =0;i<10;i++) {
            if (i<5) {
                this.lights.get(SwitchType.SideLights)[i] =new SideLight(PositionType.left); //5 on each side
            } else {
                this.lights.get(SwitchType.SideLights)[i] =new SideLight(PositionType.right);
            }
        }
        for (int i =0;i<6;i++) {
            if (i<3) { //3 on each side
                this.lights.get(SwitchType.headLightsFront)[i] = new HeadLight(PositionType.frontleftbottom);
            } else {
                this.lights.get(SwitchType.headLightsFront)[i] = new HeadLight(PositionType.frontrightbottom);
            }
        }
        for (int i=0;i<4;i++) { // 4 on the top
            this.lights.get(SwitchType.headLightsFront)[i] = new HeadLight(PositionType.frontop);
        }
        //the blue lights at the front
        this.lights.get(SwitchType.BlueLights)[0] = new BlueLight(PositionType.frontleftbottom,1);
        this.lights.get(SwitchType.BlueLights)[1] = new BlueLight(PositionType.frontrightbottom,1);
        //blue Lights at the top front left and right
        this.lights.get(SwitchType.BlueLights)[2] = new BlueLight(PositionType.fronlefttop,4);
        this.lights.get(SwitchType.BlueLights)[3] = new BlueLight(PositionType.fronlefttop,4);
        this.lights.get(SwitchType.BlueLights)[4] = new BlueLight(PositionType.frontrighttop,4);
        this.lights.get(SwitchType.BlueLights)[5] = new BlueLight(PositionType.frontrighttop,4);
        //bluelights at the back left and right
        this.lights.get(SwitchType.BlueLights)[6] = new BlueLight(PositionType.backrighttop,2);
        this.lights.get(SwitchType.BlueLights)[7] = new BlueLight(PositionType.backrighttop,2);
        this.lights.get(SwitchType.BlueLights)[8] = new BlueLight(PositionType.backlefttop,2);
        this.lights.get(SwitchType.BlueLights)[9] = new BlueLight(PositionType.backlefttop,2);

        this.lights.get(SwitchType.warningLights)[0] = new WarningLight(PositionType.fronlefttop);
        this.lights.get(SwitchType.warningLights)[1] = new WarningLight(PositionType.backrighttop);

        this.turnSignalLight = new TurnSignalLight[]{new TurnSignalLight(PositionType.frontleftbottom),
                new TurnSignalLight(PositionType.frontrightbottom),
                new TurnSignalLight(PositionType.backleftbottom),
                new TurnSignalLight(PositionType.backrightbottom)};
        MixDevice mixer = new MixDevice();
        frontCannon = new FrontCannon(mixer);
        headCannon = new HeadCannon(mixer);
        this.motors = new ElectricMotor[2];
        driverSection = new DriverSection(this.turnSignalLight);
        operatorSection = new OperatorSection(frontCannon,headCannon,lights,this.motors,mixer);
        pivotsStatic = new PivotStatic[]{new PivotStatic(),new PivotStatic()};
        pivotsTurnable = new PivotTurnable[]{new PivotTurnable(),new PivotTurnable()};
    }

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
