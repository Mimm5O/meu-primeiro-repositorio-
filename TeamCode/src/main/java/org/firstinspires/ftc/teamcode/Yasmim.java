package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.Telemetry;

     @TeleOp
     public class Yasmim  extends OpMode {
     String meunome = "Yasmim";

     @Override
     public void init() {

     }
     @Override
     public void loop(){
         telemetry.addData("meu nome",meunome );
         telemetry.update();
     }}

