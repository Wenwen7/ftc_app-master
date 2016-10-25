package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.Servo;
/**
 * Created by lingsbuffet on 7/28/16.
 */
public class Samuel_Comp_Changes extends OpMode {

    DcMotor left_back_drive;// naming the parts of the robot
    DcMotor left_front_drive;
    DcMotor right_back_drive;
    DcMotor right_front_drive;
    Servo s1;
    Servo s2;
    ColorSensor color1;
    ColorSensor color2;


    public void init() {

        left_back_drive = hardwareMap.dcMotor.get("1");// finding them on the robot and later used for the configuration file
        left_front_drive = hardwareMap.dcMotor.get("2");
        right_back_drive = hardwareMap.dcMotor.get("3");
        right_front_drive = hardwareMap.dcMotor.get("4");
        s1 = hardwareMap.servo.get("fl");// the left flicker
        s2 = hardwareMap.servo.get("fr");//the right flicker
        color1 = hardwareMap.colorSensor.get("c1");// in front of robot
        color2 = hardwareMap.colorSensor.get("c2");// bottom of robot
        boolean color1 = true;
        boolean color2 = true;


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

        left_back_drive.setTargetPosition(0);// set the target position that the motors will stop at
        left_front_drive.setTargetPosition(0);
        right_back_drive.setTargetPosition(0);
        right_front_drive.setTargetPosition(0);

        left_back_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);// tell the encoders to stop the robot when the encoder values equal the target position
        left_front_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        right_back_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        right_front_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);

        left_back_drive.setPower(0.3);
        left_front_drive.setPower(0.3);//go forward until target position is reached
        right_back_drive.setPower(0.3);
        right_front_drive.setPower(0.3);

        //knock the ball off the center vortex by...


        left_back_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);// resetting encoders
        left_front_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        right_back_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        right_front_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);

        left_back_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);// run the motors using encoders
        left_front_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        right_back_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        right_front_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);

        left_back_drive.setTargetPosition(0);// set the motors to stop when encoders equal the target position
        left_front_drive.setTargetPosition(0);
        right_back_drive.setTargetPosition(0);
        right_front_drive.setTargetPosition(0);

        left_back_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        left_front_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        right_back_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);// tell the encoders to stop the robot when the encoder values equal the target position
        right_front_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);

        left_back_drive.setPower(-0.3);//turn 90 degrees
        left_front_drive.setPower(-0.3);
        right_back_drive.setPower(0.3);
        right_front_drive.setPower(0.3);


        // go onto center vortex


        left_back_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);// resetting encoders
        left_front_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        right_back_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        right_front_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);

        left_back_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);// run the motors using encoders
        left_front_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        right_back_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        right_front_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);

        left_back_drive.setTargetPosition(0);// set the motors to stop when encoders equal the target position
        left_front_drive.setTargetPosition(0);
        right_back_drive.setTargetPosition(0);
        right_front_drive.setTargetPosition(0);

        left_back_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        left_front_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        right_back_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        right_front_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);// tell the encoders to stop the robot when the encoder values equal the target position

        left_back_drive.setPower(0.3);//go forward
        left_front_drive.setPower(0.3);
        right_back_drive.setPower(0.3);
        right_front_drive.setPower(0.3);


        left_back_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);// resetting encoders
        left_front_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        right_back_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        right_front_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);

        left_back_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);// run the motors using encoders
        left_front_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        right_back_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        right_front_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);

        left_back_drive.setTargetPosition(0);// set the motors to stop when encoders equal the target position
        left_front_drive.setTargetPosition(0);
        right_back_drive.setTargetPosition(0);
        right_front_drive.setTargetPosition(0);

        left_back_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        left_front_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        right_back_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);// tell the encoders to stop the robot when the encoder values equal the target position
        right_front_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);

        // turn 90 degrees

        left_back_drive.setPower(-0.3);
        left_front_drive.setPower(-0.3);
        right_back_drive.setPower(0.3);
        right_front_drive.setPower(0.3);

        // go forward

        left_back_drive.setPower(0.3);
        left_front_drive.setPower(0.3);
        right_back_drive.setPower(0.3);
        right_front_drive.setPower(0.3);


        if (color2.argb() < 0){// is white
            left_back_drive.setPower(0.0);
            left_front_drive.setPower(0.0);
            right_back_drive.setPower(0.0);
            right_front_drive.setPower(0.0);
        }
        if (color1.red() < 0){//if it is red
            s1.setPosition(1.0);// push the button!!!


        }
        if (color1.blue() > 0){//if it is blue
            s2.setPosition(1.0);// or the other one
        }
        s1.setPosition(0.0);
        s2.setPosition(0.0);

        //back up

        left_back_drive.setPower(-0.3);
        left_front_drive.setPower(-0.3);
        right_back_drive.setPower(-0.3);
        right_front_drive.setPower(-0.3);

        //turn right

        left_back_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);// resetting encoders
        left_front_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        right_back_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        right_front_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);

        left_back_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);// run the motors using encoders
        left_front_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        right_back_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        right_front_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);

        left_back_drive.setTargetPosition(0);// set the motors to stop when encoders equal the target position
        left_front_drive.setTargetPosition(0);
        right_back_drive.setTargetPosition(0);
        right_front_drive.setTargetPosition(0);

        left_back_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        left_front_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);// tell the encoders to stop the robot when the encoder values equal the target position
        right_back_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        right_front_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);

        left_back_drive.setPower(0.3);
        left_front_drive.setPower(0.3);
        right_back_drive.setPower(-0.3);
        right_front_drive.setPower(-0.3);

        left_back_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);// resetting encoders
        left_front_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        right_back_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        right_front_drive.setMode(DcMotorController.RunMode.RESET_ENCODERS);

        left_back_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);// run the motors using encoders
        left_front_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        right_back_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        right_front_drive.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);

        left_back_drive.setTargetPosition(0);// set the motors to stop when encoders equal the target position
        left_front_drive.setTargetPosition(0);
        right_back_drive.setTargetPosition(0);
        right_front_drive.setTargetPosition(0);

        left_back_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        left_front_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        right_back_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        right_front_drive.setMode(DcMotorController.RunMode.RUN_TO_POSITION);// tell the encoders to stop the robot when the encoder values equal the target position

        left_back_drive.setPower(0.3);
        left_front_drive.setPower(0.3);
        right_back_drive.setPower(0.3);
        right_front_drive.setPower(0.3);

        if (color2.argb() > 0){ // if it is white
            left_back_drive.setPower(-0.3);
            left_front_drive.setPower(-0.3);
            right_back_drive.setPower(0.3);
            right_front_drive.setPower(0.3);
        }
        if (color1.red() < 0){// if color on beacon is red
            s1.setPosition(1.0);// push the button!!!
        }
        if (color1.blue() > 0){// if color on beacon is blue
            s2.setPosition(1.0);
        }
        s1.setPosition(0.0);
        s2.setPosition(0.0);


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
        telemetry.addData("s1", s1.getPosition());//display servo values
        telemetry.addData("s2", s2.getPosition());

        right_front_drive.setPower(gamepad1.right_stick_y);
        left_back_drive.setPower(gamepad1.left_stick_y);
        right_back_drive.setPower(gamepad1.right_stick_y);
        left_back_drive.setPower(gamepad1.left_stick_y);
    }
}








