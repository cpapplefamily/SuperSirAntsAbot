package org.usfirst.frc3244.SuberSirAntsABot2.autonomousroutines;

import org.usfirst.frc3244.SuperSirAntsABot2.commands.Drive_For_Distance;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.Drive_Set_Gyro;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Auto_12_1_Start_Left_Deliver_Scale_IF_L extends CommandGroup {

    public Auto_12_1_Start_Left_Deliver_Scale_IF_L() {
    	// * not using the Direction Chooser to Buggy addSequential(new Drive_Set_Gyro_Chooser(),1); //Not set
    	addSequential(new Drive_Set_Gyro(0.0),1);
    	//addSequential(new Drive_For_Distance(-0.1, 0.7, 0.0, 40, 0.0));
    	addSequential(new Auto_12_2_Conditional_IsScale_L());
    }
}
