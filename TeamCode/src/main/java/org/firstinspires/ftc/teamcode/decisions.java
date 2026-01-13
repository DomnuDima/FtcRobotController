package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class decisions  extends OpMode {
    @Override
    public void init() {

    }


    @Override
    public void loop() {
        double leftY = gamepad1.left_stick_y;
        if (leftY < 0) {
            telemetry.addData("Left stick", "negative!");
        }

        else {
            telemetry.addData("Left Stick", "positive!");
        }
    }
}
