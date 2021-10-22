package main.java.Operator;

import main.java.ExtinguishDevices.HeadCannon;
import main.java.ExtinguishDevices.MixDevice;
import main.java.FLF.PositionType;
import main.java.Joystick.JoyStickFeeler;
import main.java.Joystick.Joystick;
import main.java.Joystick.PressureButton;

public class JoystickHeadCanon extends Joystick {
    private HeadCannon headCanon;
    private MixDevice mixDevice;
    private JoyStickFeeler feeler;
    private PressureButton buttons[];
    public JoystickHeadCanon(HeadCannon canon, MixDevice mixing) {
        super();
        this.headCanon = canon;
        this.mixDevice = mixing;
        feeler = new JoyStickFeeler(canon);
        buttons = new PressureButton[]{new PressureButton(PositionType.left,canon), new PressureButton(PositionType.right,canon)};
    }
}
