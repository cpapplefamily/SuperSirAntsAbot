package org.usfirst.frc3244.SuperSirAntsABot2.commands;

import org.usfirst.frc3244.SuperSirAntsABot2.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ScissorSafeLowerToStow extends CommandGroup {

    public ScissorSafeLowerToStow() {
       addParallel(new Intake_Close(1),1);
       //addParallel(new Wrist_Up(1), 1);	
       addParallel(new ScissorToSetpoint(Robot.scissor.DOWN,true), 5);
    }
}
