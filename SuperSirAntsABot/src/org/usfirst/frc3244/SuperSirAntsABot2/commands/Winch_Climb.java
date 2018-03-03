package org.usfirst.frc3244.SuperSirAntsABot2.commands;

import org.usfirst.frc3244.SuperSirAntsABot2.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Winch_Climb extends Command {

	private double m_rotations;
    public Winch_Climb(double rotations) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.winch);
    	m_rotations = rotations;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drive.set_PreserveHeading(false);
    	Robot.winch.my_zeroEncoders();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.winch.my_WinchMotionMagic(-m_rotations);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	//Robot.drive.set_PreserveHeading(true);
    	Robot.winch.my_WinchStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
