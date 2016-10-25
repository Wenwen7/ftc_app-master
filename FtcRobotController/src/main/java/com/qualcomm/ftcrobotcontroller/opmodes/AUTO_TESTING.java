package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by lingsbuffet on 9/29/16.
 */
public class AUTO_TESTING {

    DcMotor left_back_drive;// naming the parts of the robot
    DcMotor left_front_drive;
    DcMotor right_back_drive;
    DcMotor right_front_drive;
    Servo s1;
    Servo s2;
    ColorSensor color1;
    ColorSensor color2;


    public void init() {


    }

    public void loop() {

        left_back_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);// resetting encoders
        left_front_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        right_back_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        right_front_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);

        left_back_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);// run the motors using encoders
        left_front_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        right_back_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        right_front_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
    }
}


