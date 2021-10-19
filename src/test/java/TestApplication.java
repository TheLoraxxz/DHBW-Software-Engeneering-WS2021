package test.java;
import main.java.Cabine.BusDoor;
import main.java.Cabine.Seat;
import main.java.Engine.Pivot;
import main.java.FLF.FLF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApplication {
    private FLF flf;

    @BeforeEach
    public void Setup(){
        flf = new FLF();
    }

    @Test
    @Order(1)
    public void buildComplete()
    {
        //flfS
        assertNotNull(flf.getCabine());
        assertNotNull(flf.getCentralUnit());
        assertEquals(4,flf.getBatteries().length);
        //Cabine
        assertEquals(4,flf.getCabine().getSeats().length);
        for (Seat s:flf.getCabine().getSeats()) {
            assertNotNull(s.getRespirators());
        }
        assertEquals(2,flf.getCabine().getBusDoors().length);
        assertNotNull(flf.getCabine().getEnergyDisplay());
        assertNotNull(flf.getCabine().getSpeedDisplay());
        for (BusDoor b:flf.getCabine().getBusDoors()) {
            assertEquals(2,b.getDoorFeelers().length);
        }
        //central unit
        //lights
        /* assertEquals(2,flf.getCentralUnit().getWarningLights());
           assertEquals(20,flf.getCentralUnit().getHeadLights());
           assertEquals(10,flf.getCentralUnit().getBlueLights());
            for(int i =0; i < 10;i++)
            {
                 switch(i)
                    case 0:
                    case 1:assertEquals(1,flf.getCentralUnit().getBlueLights()[i].getLeds());break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:assertEquals(2,flf.getCentralUnit().getBlueLights()[i].getLeds());break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:assertEquals(4,flf.getCentralUnit().getBlueLights()[i].getLeds());break;
            }
        }
           assertEquals(4,flf.getCentralUnit().getTurnSignalLights());
           assertEquals(2,flf.getCentralUnit().getBreakLights());
         */
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
        /*assertNotNull(flf.getCentralUnit().getOperatorSection().getControlPanel());
        for (Switch s:flf.getCentralUnit().getOperatorSection().getControlPanel().getSwitches()) {
            assertNotNull(s);
        }
        assertNotNull(flf.getCentralUnit().getOperatorSection().getControlPanel().getKnopRoofWaterCanon);
        assertNotNull(flf.getCentralUnit().getOperatorSection().getControlPanel());*/

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

    }
    @Test
    @Order(5)
    public void handleEmergencyService()
    {

    }
    @Test
    @Order(6)
    public void handleFuelTruckOnFire()
    {

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
}
