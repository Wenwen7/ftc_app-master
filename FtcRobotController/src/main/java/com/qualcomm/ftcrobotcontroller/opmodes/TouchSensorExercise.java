package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * Created by lingsbuffet on 6/4/16.
 */
public class TouchSensorExercise extends OpMode {
/*These variables keep track of the hardware on the robot. Once you assign motors to them, you can control those motors using these variables.*/
    int count_of_presses = 0;
    boolean is_pressed = true;
    TouchSensor touch_sensor;

/*Init ia a good time to assign your motors to variables. If there are any problems, like not being able to find one of the motors, you'll know now before the match starts*/
    public void init() {



        touch_sensor = hardwareMap.touchSensor.get("touch");
    }

/*This is the main part of the program. In it, we want the robot to listen to the joystick input and drive accordingly. In this example, we won't do anything fancy with the joystick input - just feed it to the motors. In reality, you might consider scaling the input to help make the robot easier to drive.*/
    public void loop() {



        if(touch_sensor.isPressed()){
            count_of_presses = count_of_presses + 1;
            telemetry.addData("Touch", count_of_presses);
        }



            }

        }

