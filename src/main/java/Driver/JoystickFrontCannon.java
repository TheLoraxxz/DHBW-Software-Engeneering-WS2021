package main.java.Driver;

import main.java.ExtinguishDevices.FrontCannon;
import main.java.FLF.PositionType;
import main.java.Joystick.JoyStickFeeler;
import main.java.Joystick.Joystick;
import main.java.Joystick.PressureButton;

public class JoystickFrontCannon extends Joystick{

    protected JoyStickFeeler feeler;
    protected PressureButton[] buttons;
    
    public JoystickFrontCannon(FrontCannon canon) {
        super();

        feeler = new JoyStickFeeler(canon);
        buttons = new PressureButton[]{new PressureButton(PositionType.left,canon), new PressureButton(PositionType.right,canon)};
    }   
}
