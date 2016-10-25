package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.util.Range;


/**
 * Created by lingsbuffet on 9/20/16.
 */
public class VELOCITY_VORTEX_AUTO_2 extends LinearOpMode{

    DcMotor left_front_drive;
    DcMotor left_back_drive;
    DcMotor right_front_drive;
    DcMotor right_back_drive;
    TouchSensor touch_sensor;

    public void runOpMode () throws InterruptedException {

        left_front_drive = hardwareMap.dcMotor.get("1");
        left_back_drive = hardwareMap.dcMotor.get("2");
        right_front_drive = hardwareMap.dcMotor.get("3");
        right_back_drive = hardwareMap.dcMotor.get("4");
        touch_sensor = hardwareMap.touchSensor.get("touch");

        right_back_drive.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();


        left_front_drive.setPower(0.5);
        left_back_drive.setPower(0.5);
        right_front_drive.setPower(0.5);
        right_back_drive.setPower(0.5);

        if (touch_sensor.isPressed()) {

            left_front_drive.setPower(-0.5);
            left_back_drive.setPower(-0.5);
            right_front_drive.setPower(-0.5);
            right_back_drive.setPower(-0.5);

            sleep(1000);

            left_front_drive.setPower(0.5);
            left_back_drive.setPower(0.5);
            right_front_drive.setPower(-0.5);
            right_back_drive.setPower(-0.5);

            sleep(1000);

            left_front_drive.setPower(1);
            left_back_drive.setPower(1);
            right_front_drive.setPower(1);
            right_back_drive.setPower(1);











        }







    }

}
