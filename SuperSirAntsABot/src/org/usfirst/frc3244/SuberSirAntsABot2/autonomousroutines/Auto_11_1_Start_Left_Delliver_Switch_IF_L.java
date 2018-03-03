package org.usfirst.frc3244.SuberSirAntsABot2.autonomousroutines;

import org.usfirst.frc3244.SuperSirAntsABot2.Robot;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.Drive_For_Distance;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.Drive_Set_Gyro;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.Drive_Turn_To_Setpoint;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.IntakeLaunch;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.ScissorToSetpoint;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.Wrist_Down;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Auto_11_1_Start_Left_Delliver_Switch_IF_L extends CommandGroup {

    public Auto_11_1_Start_Left_Delliver_Switch_IF_L() {
    	// * not using the Direction Chooser to Buggy addSequential(new Drive_Set_Gyro_Chooser(),1); //Not set
    	addSequential(new Drive_Set_Gyro(0.0),1);
    	//addSequential(new Drive_For_Distance(0.0, 0.3, 0.0, 17, 0.0));
    	addSequential(new Auto_11_2_Conditional_IsSwitch_L());
    	
    
    }
}
