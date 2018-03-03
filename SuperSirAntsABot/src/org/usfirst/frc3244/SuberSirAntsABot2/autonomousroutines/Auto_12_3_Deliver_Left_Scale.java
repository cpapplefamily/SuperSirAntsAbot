package org.usfirst.frc3244.SuberSirAntsABot2.autonomousroutines;

import org.usfirst.frc3244.SuperSirAntsABot2.Constants;
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
public class Auto_12_3_Deliver_Left_Scale extends CommandGroup {

    public Auto_12_3_Deliver_Left_Scale() {
    	addParallel(new Wrist_Down(1));
    	addParallel(new ScissorToSetpoint(Robot.scissor.SCALE,true),Constants.kScissorToSetpointTimout_S);
    	addSequential(new Drive_For_Distance(-0.1, 0.7, 0.0, 40, 0.0));
    	addSequential(new Auto_Util_TimeDelay(.5));
    	addSequential(new Drive_Turn_To_Setpoint(0.0, 0.0, 90), 3);
    	addSequential(new Auto_Util_TimeDelay(.5));
    	addSequential(new IntakeLaunch(-600),2);
    	addSequential(new ScissorToSetpoint(Robot.scissor.DOWN,true),3);	
    }
}
