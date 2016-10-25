package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.HardwareMap;


/**
 * Created by lingsbuffet on 8/2/16.
 */
public class ENCODERS extends OpMode {
    DcMotor left_drive1;// naming
    DcMotor left_drive2;
    DcMotor right_drive1;
    DcMotor right_drive2;


    public void init() {

        left_drive1 = hardwareMap.dcMotor.get("1"); // use later for config file
        right_drive1 = hardwareMap.dcMotor.get("2");
        left_drive2 = hardwareMap.dcMotor.get("3");
        right_drive2 = hardwareMap.dcMotor.get("4");




    }

    public void loop() {



        right_drive1.setPower(gamepad1.right_stick_y); // gamepad controls
        left_drive1.setPower(gamepad1.left_stick_y);
        right_drive2.setPower(gamepad1.right_stick_y);
        left_drive2.setPower(gamepad1.left_stick_y);


    }
}

