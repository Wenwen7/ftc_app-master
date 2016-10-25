package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
//import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by lingsbuffet on 9/30/16.
 */
public class AUTO_TESTING_2 extends OpMode {

    DcMotor left_back_drive;// naming the parts of the robot
    DcMotor left_front_drive;
    DcMotor right_back_drive;
    DcMotor right_front_drive;
    //Servo s1;
  //  Servo s2;
    ColorSensor color1;
    ColorSensor color2;


    public void init() {

        left_back_drive = hardwareMap.dcMotor.get("left_back_drive");// finding them on the robot and later used for the configuration file
        left_back_drive.setDirection(DcMotor.Direction.REVERSE);
        left_front_drive = hardwareMap.dcMotor.get("left_front_drive");
        right_back_drive = hardwareMap.dcMotor.get("right_back_drive");
        right_front_drive.setDirection(DcMotor.Direction.REVERSE);
        right_front_drive = hardwareMap.dcMotor.get("right_front_drive");
        //s1 = hardwareMap.servo.get("fl");// the left flicker
        //s2 = hardwareMap.servo.get("fr");//the right flicker
        color1 = hardwareMap.colorSensor.get("color1");// in front of robot
        color2 = hardwareMap.colorSensor.get("color2");// bottom of robot



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

        telemetry.addData("e1", left_back_drive.getCurrentPosition());// show encoder ticks for all motors
        telemetry.addData("e2", left_front_drive.getCurrentPosition());
        telemetry.addData("e3", right_back_drive.getCurrentPosition());
        telemetry.addData("e4", right_front_drive.getCurrentPosition());
        telemetry.addData("Red1", color1.red());// display color values
        telemetry.addData("alpha1", color1.alpha());
        telemetry.addData("blue1", color1.blue());
        telemetry.addData("green1", color1.green());
        telemetry.addData("Red2", color2.red());
        telemetry.addData("alpha2", color2.alpha());
        telemetry.addData("blue2", color2.blue());
        telemetry.addData("green2", color2.green());
        //telemetry.addData("s1", s1.getPosition());//display servo values
        //telemetry.addData("s2", s2.getPosition());

        right_front_drive.setPower(gamepad1.right_stick_y);
        left_back_drive.setPower(gamepad1.left_stick_y);
        right_back_drive.setPower(gamepad1.right_stick_y);
        left_back_drive.setPower(gamepad1.left_stick_y);




    }


}
