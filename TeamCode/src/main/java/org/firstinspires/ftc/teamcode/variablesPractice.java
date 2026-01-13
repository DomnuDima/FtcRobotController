package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class variablesPractice extends OpMode {
    @Override
    public void init()  {
        int teamNumber = 34096;
        int motorAngle = 90;
        double motorSpeed = 0.5;
        boolean clawClosed = true;
        String name = "Dima";

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor speed", motorSpeed);
        telemetry.addData("Is claw closed?", clawClosed);
        telemetry.addData("My name", name);
        telemetry.addData("Motor angle", motorAngle);
    }

    @Override
    public void loop() {

    }
}
