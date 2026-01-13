package org.firstinspires.ftc.teamcode;//all the buttons have only just booleans like true or false values

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class newControllerProject  extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        //runs 50x* a sec
        double speedForward = -gamepad1.left_stick_y / 2.0;
        double exercise = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double triggers = gamepad1.right_trigger + gamepad1.left_trigger;


        telemetry.addData("x", gamepad1.left_stick_x);
        telemetry.addData("diff" , exercise);
        telemetry.addData("y", speedForward);
        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("b but", gamepad1.b) ;
        telemetry.addData("right x", gamepad1.right_stick_x);
    }
}
