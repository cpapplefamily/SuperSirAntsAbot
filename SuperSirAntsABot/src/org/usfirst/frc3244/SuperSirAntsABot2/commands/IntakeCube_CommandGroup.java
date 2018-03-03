package org.usfirst.frc3244.SuperSirAntsABot2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class IntakeCube_CommandGroup extends CommandGroup {

    public IntakeCube_CommandGroup() {
        addParallel(new Intake_Float(1));
        addParallel(new IntakeCube());
        //addParallel(new IntakeCube_VariableSpeed());
    }
}
