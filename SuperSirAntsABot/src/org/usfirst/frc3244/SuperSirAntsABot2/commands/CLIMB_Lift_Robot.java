package org.usfirst.frc3244.SuperSirAntsABot2.commands;

import org.usfirst.frc3244.SuperSirAntsABot2.subsystems.Winch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CLIMB_Lift_Robot extends CommandGroup {

    public CLIMB_Lift_Robot() {
       addParallel(new Winch_Climb(Winch.TEST_ROTATIONS));
       addSequential(new Scissor_Climb());
    }
}
