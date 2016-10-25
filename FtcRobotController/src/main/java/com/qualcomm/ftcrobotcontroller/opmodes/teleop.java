package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.IrSeekerSensor;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by lingsbuffet on 8/5/16.
 */
public class teleop extends OpMode {

    DcMotor motorl1;
    DcMotor motorl2;
    DcMotor motorr1;
    DcMotor motorr2;
    IrSeekerSensor irSeeker;

    public void init(){

        motorl1 = hardwareMap.dcMotor.get("1");
        motorl2 = hardwareMap.dcMotor.get("2");
        motorr1 = hardwareMap.dcMotor.get("3");
        motorr2 = hardwareMap.dcMotor.get("4");
        irSeeker = hardwareMap.irSeekerSensor.get("IR");

        motorl1.setDirection(DcMotor.Direction.REVERSE);
        motorr1.setDirection(DcMotor.Direction.REVERSE);


    }
    public void loop(){

        double irangle;

        irangle = irSeeker.getAngle();

        telemetry.addData("ir", irangle);



        if (irangle > 0){







        }

    }

}
