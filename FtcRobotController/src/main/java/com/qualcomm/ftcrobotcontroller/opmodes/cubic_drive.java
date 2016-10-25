package com.qualcomm.ftcrobotcontroller.opmodes;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

/**
 * Created by lingsbuffet on 7/23/16.rr
 */
public class cubic_drive extends OpMode {
    private DcMotorController dc_drive_controller;

    DcMotor right_drive;
    DcMotor left_drive;

    public void init () {
        right_drive = hardwareMap.dcMotor.get("m1");
        left_drive = hardwareMap.dcMotor.get("m2");

        right_drive.setDirection(DcMotor.Direction.REVERSE);
        left_drive.setDirection(DcMotor.Direction.REVERSE);


    }


    public void loop() {

        right_drive.setPower(gamepad1.right_stick_y);
        left_drive.setPower(gamepad1.left_stick_y);

    }


}
