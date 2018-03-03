package org.usfirst.frc3244.SuperSirAntsABot2.commands;

import org.usfirst.frc3244.SuperSirAntsABot2.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Intake_Cube_Finnish_CommandGroup extends CommandGroup {

    public Intake_Cube_Finnish_CommandGroup() {
       addSequential(new Intake_SpinCube());
       addSequential(new IntakeCube(),2);
       addSequential(new ScissorToSetpoint(Robot.scissor.DRIVE_WITH_CUBE,true));
    }
}
