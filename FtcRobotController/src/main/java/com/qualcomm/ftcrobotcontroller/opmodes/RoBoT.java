package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by lingsbuffet on 10/24/16.
 */

public class RoBoT extends OpMode {

    DcMotor left_front_drive;
    DcMotor right_front_drive;
    DcMotor left_back_drive;
    DcMotor right_back_drive;
    DcMotor left_fly_wheel;
    DcMotor right_fly_wheel;
    Servo left_pusher;
    Servo right_pusher;
    Servo left_fly_wheel_mover;
    Servo right_fly_wheel_mover;

    public void init() {

        left_front_drive = hardwareMap.dcMotor.get("1");
        right_front_drive = hardwareMap.dcMotor.get("2");
        left_back_drive = hardwareMap.dcMotor.get("3");
        right_back_drive = hardwareMap.dcMotor.get("4");
        left_fly_wheel = hardwareMap.dcMotor.get("5");
        right_fly_wheel = hardwareMap.dcMotor.get("6");
        left_pusher = hardwareMap.servo.get("a");
        right_pusher = hardwareMap.servo.get("b");
        left_fly_wheel_mover = hardwareMap.servo.get("c");
        right_fly_wheel_mover = hardwareMap.servo.get("d");

    }

    public void loop() {

        left_pusher.setPosition(0);
        right_pusher.setPosition(0);
        left_fly_wheel_mover.setPosition(0);
        right_fly_wheel_mover.setPosition(0);

        right_front_drive.setPower(gamepad1.right_stick_y);
        left_front_drive.setPower(gamepad1.left_stick_y);
        right_back_drive.setPower(gamepad1.right_stick_y);
        left_back_drive.setPower(gamepad1.left_stick_y);

        left_pusher.setPosition(gamepad2.left_trigger);
        right_pusher.setPosition(gamepad2.right_trigger);

        telemetry.addData("left_pusher", left_pusher.getPosition());
        telemetry.addData("right_pusher", right_pusher.getPosition());
        telemetry.addData("left_back_drive", left_back_drive.getCurrentPosition());// show encoder ticks for all motors
        telemetry.addData("right_back_drive", right_back_drive.getCurrentPosition());
        telemetry.addData("left_front_drive", left_front_drive.getCurrentPosition());
        telemetry.addData("right_front_drive", right_front_drive.getCurrentPosition());


        }


    }
}
