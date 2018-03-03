package org.usfirst.frc3244.SuberSirAntsABot2.autonomousroutines;

import org.usfirst.frc3244.SuperSirAntsABot2.Robot;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.Drive_For_Distance;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.Drive_Turn_To_Setpoint;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.IntakeLaunch;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.ScissorToSetpoint;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.Wrist_Down;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Auto_31_3_Deliver_Right_Switch extends CommandGroup {

    public Auto_31_3_Deliver_Right_Switch() {
    	addParallel(new Wrist_Down(1));
    	addParallel(new ScissorToSetpoint(Robot.scissor.SWITCH,true),5);
    	addSequential(new Drive_For_Distance(0.0, 0.5, 0.0, 17, 0.0),5); //added 
    	addSequential(new Auto_Util_TimeDelay(1));
    	addSequential(new Drive_Turn_To_Setpoint(0.0, 0.0, -90), 3);
    	addSequential(new Auto_Util_TimeDelay(1));
    	//addSequential(new Wrist_Down(1));								//Moved to top
    	//addSequential(new ScissorToSetpoint(Robot.scissor.SWITCH),5);	// moved to top
    	addSequential(new IntakeLaunch(-600),2);
    	addSequential(new ScissorToSetpoint(Robot.scissor.DOWN,true),5);
    }
}
