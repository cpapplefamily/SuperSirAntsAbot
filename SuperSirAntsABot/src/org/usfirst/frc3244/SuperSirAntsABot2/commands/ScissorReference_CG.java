package org.usfirst.frc3244.SuperSirAntsABot2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ScissorReference_CG extends CommandGroup {

    public ScissorReference_CG() {
    	addSequential(new ScissorReferenc_to_LimitSwitch());
    	//addSequential(new ScissorReference_Off_LimitSwitch());
    }
}
