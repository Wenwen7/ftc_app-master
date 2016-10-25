package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.IrSeekerSensor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by lingsbuffet on 7/23/16.
 */
public class IrSeeker extends OpMode {

    DcMotor left_drive, right_drive;
    Servo servo;

    ColorSensor color;
    IrSeekerSensor ir;
    double some_decimal;
    boolean yes_or_no;

    public void init() {

        left_drive = hardwareMap.dcMotor.get("motor1");
    }


    public void loop() {

        some_decimal = -gamepad1.left_stick_y;
        some_decimal = Range.clip(some_decimal, -1, 1);

    }
}
