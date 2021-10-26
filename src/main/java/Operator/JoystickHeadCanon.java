package main.java.Operator;

import main.java.ExtinguishDevices.HeadCannon;
import main.java.ExtinguishDevices.MixDevice;
import main.java.FLF.PositionType;
import main.java.Joystick.JoyStickFeeler;
import main.java.Joystick.Joystick;
import main.java.Joystick.PressureButton;

public class JoystickHeadCanon extends Joystick {
    
    protected JoyStickFeeler feeler;
    protected PressureButton[] buttons;
    public JoystickHeadCanon(HeadCannon canon) {
        super();
        feeler = new JoyStickFeeler(canon);
        buttons = new PressureButton[]{new PressureButton(PositionType.left,canon), new PressureButton(PositionType.right,canon)};
    }
}
