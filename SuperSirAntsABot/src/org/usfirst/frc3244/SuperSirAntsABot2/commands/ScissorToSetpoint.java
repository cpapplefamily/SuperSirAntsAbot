// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3244.SuperSirAntsABot2.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc3244.SuperSirAntsABot2.Robot;

/**
 *
 */
public class ScissorToSetpoint extends Command {
	private double m_Setpoint;
	private boolean m_continueToServo;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public ScissorToSetpoint(double setpoint, boolean continueTOServo) {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.scissor);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        m_Setpoint = setpoint;
        m_continueToServo = continueTOServo;
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	//Robot.scissor.my_scissor_height(m_Setpoint);
    	Robot.scissor.my_set_MotoinMagic_Start_Memory();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	Robot.scissor.my_ScissorMotionMagic(m_Setpoint);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
    	boolean b = Robot.scissor.onTarget();
    	SmartDashboard.putBoolean("Scissor To SetPoint isFinished", b);
        return b;
    	//return false;//((Robot.scissor.my_get_LEFT_Raw_Encoder()+Robot.scissor.my_get_RIGHT_Raw_Encoder())/2)-1000>m_Setpoint*877.714;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    	if(!m_continueToServo || Robot.scissor.getOvertraveles()) {
    		Robot.scissor.my_ScissorStop();
    	}
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    	end();
    }
}