package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by lingsbuffet on 6/18/16.
 */
public class Telemetry extends OpMode {

    ColorSensor color_sensor;
    DcMotor left_drive;

    public void init() {
        color_sensor = hardwareMap.colorSensor.get("color");
        left_drive = hardwareMap.dcMotor.get("motor");
    }

    public void loop() {

        telemetry.addData("Red", color_sensor.red());
        telemetry.addData("Blue", color_sensor.blue());
        telemetry.addData("Green", color_sensor.green());
        telemetry.addData("Alpha", color_sensor.alpha());

        telemetry.addData("Encoder", left_drive.getCurrentPosition());
        int red_color = color_sensor.red();
        

    }
}