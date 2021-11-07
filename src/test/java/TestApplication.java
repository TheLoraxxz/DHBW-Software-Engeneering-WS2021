package test.java;
import main.java.Cabine.BusDoor;
import main.java.Cabine.Seat;
import main.java.Engine.Pivot;
import main.java.ExtinguishDevices.CannonState;
import main.java.ExtinguishDevices.FrontWaterStepsType;
import main.java.ExtinguishDevices.KnopRoofStepsType;
import main.java.FLF.FLF;
import main.java.Lights.BlueLight;
import main.java.Lights.LED;
import main.java.Lights.Lights;
import main.java.Lights.WarningLight;
import main.java.Operator.LightSwitch;
import main.java.Person.Driver;
import main.java.Person.Operator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApplication {
    private FLF flf;

    @BeforeEach
    public void Setup(){
        flf = new FLF.Builder().build();
    }
    
    @Test
    @Order(1)
    public void buildComplete()
    {
        //flfS
        assertNotNull(flf.getCabin());
        assertNotNull(flf.getCentralUnit());
        assertNotNull(flf.getBatteries());
        assertEquals(4,flf.getBatteries().getBatteries().length);
        //Cabine
        assertEquals(4,flf.getCabin().getSeats().length);
        for (Seat s:flf.getCabin().getSeats()) {
            assertNotNull(s.getRespirators());
        }
        assertEquals(2,flf.getCabin().getBusDoors().length);
        assertNotNull(flf.getCabin().getEnergyDisplay());
        assertNotNull(flf.getCabin().getSpeedDisplay());
        for (BusDoor b:flf.getCabin().getBusDoors()) {
            assertEquals(2,b.getDoorFeelers().length);
        }
        //central unit
        //lights
        assertEquals(2,flf.getCentralUnit().getWarningLights().length);
        assertEquals(6,flf.getCentralUnit().getHeadFrontLights().length);
        assertEquals(4,flf.getCentralUnit().getHeadRoofLights().length);
        assertEquals(10,flf.getCentralUnit().getSideLights().length);
           assertEquals(10,flf.getCentralUnit().getBlueLights().length);
            for(int i =0; i < 10;i++)
            {
                if (flf.getCentralUnit().getBlueLights()[i] instanceof BlueLight)
                 switch(i){
                    case 0:
                    case 1:assertEquals(1,((BlueLight)flf.getCentralUnit().getBlueLights()[i]).getLeds().length);break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:assertEquals(4,((BlueLight)flf.getCentralUnit().getBlueLights()[i]).getLeds().length);break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:assertEquals(2,((BlueLight)flf.getCentralUnit().getBlueLights()[i]).getLeds().length);break;
            }
        }
        assertEquals(4,flf.getCentralUnit().getTurnSignalLights().length);
        assertEquals(2,flf.getCentralUnit().getBreakLights().length);

        //Cannons
        assertNotNull(flf.getCentralUnit().getFrontCannon());
        assertNotNull(flf.getCentralUnit().getHeadCannon());
        //pivots
        assertEquals(2,flf.getCentralUnit().getPivotsStatic().length);
        assertEquals(2,flf.getCentralUnit().getPivotsTurnable().length);
        for (Pivot p:flf.getCentralUnit().getPivotsStatic()) {
            assertEquals(6,p.getBreakDisks().length);
            assertEquals(2,p.getWheels().length);
        }
        //driverSection
        assertNotNull(flf.getCentralUnit().getDriverSection());
        assertNotNull(flf.getCentralUnit().getDriverSection().getBreakPedal());
        assertNotNull(flf.getCentralUnit().getDriverSection().getGasPedal());
        assertNotNull(flf.getCentralUnit().getDriverSection().getSteeringWheel());
        assertNotNull(flf.getCentralUnit().getDriverSection().getJoystickFrontCannon());
        //operatorSection
        assertNotNull(flf.getCentralUnit().getOperatorSection());
        assertNotNull(flf.getCentralUnit().getOperatorSection().getPanel());
        for (LightSwitch s:flf.getCentralUnit().getOperatorSection().getPanel().getSwitches()) {
            assertNotNull(s);
        }
        assertNotNull(flf.getCentralUnit().getOperatorSection().getPanel().getKnobRoof());
        assertNotNull(flf.getCentralUnit().getOperatorSection().getPanel());
    }
    @Test
    @Order(2)
    public void usageControlPanel()
    {
        
    }
    @Test
    @Order(3)
    public void handleParking()
    {

    }
    @Test
    @Order(4)
    public void handleInspectionDrive()
    {
        StartFLF();
        ChecklightOff(false);
        CheckTanks();
        ChangeKnopsToOne();
        Accelerate(7);
        Drive(5);
        SteerTO(-5);
        Drive(3);
        SteerTO(5);
        Drive(5);
        SteerTO(5);
        Drive(5);
        Break(7);
        CheckEnergyConsumption(376900);
    }
    @Test
    @Order(5)
    public void handleEmergencyService()
    {
        StartFLF();
        ChecklightOff(true);
        CheckTanks();
        ChangeKnopsToOne();
        Accelerate(20);
        Drive(10);
        CheckEnergyConsumption(359000);
    }
    @Test
    @Order(6)
    public void handleFuelTruckOnFire()
    {
        StartFLF();
        ChecklightsOn();
        CheckTanks();
        //bodensprühdose
        //System.out.println(flf.getCentralUnit().getMixer().getWaterTank().getCapacity());
        //CheckWaterConsumption();
        ChangeFrontCannonState(3,FrontWaterStepsType.six,2);
        System.out.println(flf.getCentralUnit().getMixer().getWaterTank().getCapacity());
        System.out.println(flf.getCentralUnit().getMixer().getFoamTank().getCapacity());
        //CheckWaterConsumption();
        //CheckFoamConsumption();
        ChangeHeadCannonState(3,KnopRoofStepsType.c,1);
        System.out.println(flf.getCentralUnit().getMixer().getWaterTank().getCapacity());
        System.out.println(flf.getCentralUnit().getMixer().getFoamTank().getCapacity());
        //CheckWaterConsumption();
        //CheckFoamConsumption();
    }
    @Test
    @Order(7)
    public void handlePushbackVehicleOnFire()
    {

    }
    @Test
    @Order(8)
    public void handleAirplaneEngineFire()
    {

    }

    public void StartFLF()
    {
        flf.getCentralUnit().getMotors()[0].setOn(true);
        flf.getCentralUnit().getMotors()[1].setOn(true);
        flf.getCabin().getSeats()[0].setPerson(new Driver());
        flf.getCabin().getSeats()[1].setPerson(new Operator());
        //bustüren haben keine logik
        //flf.getCabin().getBusDoors()
    }

    public void ChecklightOff(boolean HeadlightValue)
    {
        assertEquals(CannonState.inactive,flf.getCentralUnit().getFrontCannon().getCannonState());
        assertEquals(CannonState.inactive,flf.getCentralUnit().getHeadCannon().getCannonState());
        for (Lights l:
                flf.getCentralUnit().getHeadRoofLights()) {
            if (HeadlightValue)
                l.on();
            else
                l.off();
            assertEquals(HeadlightValue,l.isOn());
        }
        for (Lights l:
                flf.getCentralUnit().getSideLights()) {
            l.off();
            assertFalse(l.isOn());
        }
        for (Lights l:
                flf.getCentralUnit().getHeadFrontLights()) {
            l.on();
            assertTrue(l.isOn());
        }
        CheckLEDOn();
    }

    public void ChecklightsOn()
    {
        for (Lights l:
             flf.getCentralUnit().getHeadRoofLights()) {
            l.on();
            assertTrue(l.isOn());
        }
        for (Lights l:
                flf.getCentralUnit().getSideLights()) {
            l.on();
            assertTrue(l.isOn());
        }
        for (Lights l:
                flf.getCentralUnit().getHeadFrontLights()) {
            l.on();
            assertTrue(l.isOn());
        }
        CheckLEDOn();
    }
    
    public void CheckLEDOn()
    {
        for (Lights l:
                flf.getCentralUnit().getWarningLights()) {
            WarningLight wl = (WarningLight) l;
            for (LED led:
                 wl.getLeds()) {
                led.setOn(true);
                assertTrue(led.isOn());
            }
        }
        for (Lights l:
                flf.getCentralUnit().getBlueLights()) {
            BlueLight wl = (BlueLight) l;
            for (LED led:
                    wl.getLeds()) {
                led.setOn(true);
                assertTrue(led.isOn());
            }
        }
    }

    public void CheckTanks()
    {
       assertEquals(12500,flf.getCentralUnit().getMixer().getWaterTank().getCapacity());
        assertEquals(2500,flf.getCentralUnit().getMixer().getFoamTank().getCapacity());
    }

    public void ChangeKnopsToOne()
    {
        flf.getCabin().getSeats()[1].getOperator().changeFrontKnobToType(FrontWaterStepsType.one);
        flf.getCabin().getSeats()[1].getOperator().changeHeadKnobToType(KnopRoofStepsType.a);
    }

    public void Accelerate(int iterations)
    {
        for (int i=0; i < iterations;i++)
            flf.getCabin().getSeats()[0].getDriver().pressGasPedal();
    }

    public void Drive(int iterations)
    {
        for (int i=0; i < iterations;i++)
            flf.getCabin().getSeats()[0].getDriver().releaseGasPedal();
    }

    public void SteerTO(int degree)
    {
        flf.getCabin().getSeats()[0].getDriver().turnWheel(degree);
        assertEquals(degree,flf.getCabin().getSeats()[0].getDriver().getSection().getSteeringWheel().getTurnables()[0].getTurningValue());
    }

    public void Break(int iterations)
    {
        for (int i=0; i < iterations;i++)
            flf.getCabin().getSeats()[0].getDriver().pressGasPedal();
    }

    public void CheckEnergyConsumption(int CorrectValue)
    {
        assertEquals(CorrectValue,flf.getBatteries().getCapacityAll());
    }

    public void CheckWaterConsumption(int CorrectValue)
    {
        assertEquals(CorrectValue,flf.getCentralUnit().getMixer().getWaterTank().getCapacity());
    }

    public void CheckFoamConsumption(int CorrectValue)
    {
        assertEquals(CorrectValue,flf.getCentralUnit().getMixer().getWaterTank().getCapacity());
    }

    public void ChangeFrontCannonState(int iterations, FrontWaterStepsType targetType, int mixValue)
    {
        flf.getCabin().getSeats()[0].getDriver().pressJoystickLeft();
        flf.getCabin().getSeats()[1].getOperator().changeFrontKnobToType(targetType);
        for (int i = 0; i < mixValue; i++)
        {
            flf.getCabin().getSeats()[0].getDriver().pressJoystickRight();
        }
        for (int i = 0; i < iterations; i++)
        {
            flf.getCabin().getSeats()[0].getDriver().pressFeeler();
        }
    }

    public void ChangeHeadCannonState(int iterations, KnopRoofStepsType targetType, int mixValue)
    {
        flf.getCabin().getSeats()[1].getOperator().pressJoystickLeft();
        flf.getCabin().getSeats()[1].getOperator().changeHeadKnobToType(targetType);
        for (int i = 0; i < mixValue; i++)
        {
            flf.getCabin().getSeats()[1].getOperator().pressJoystickRight();
        }
        for (int i = 0; i < iterations; i++)
        {
            flf.getCabin().getSeats()[1].getOperator().pressFeeler();
        }
    }
}
