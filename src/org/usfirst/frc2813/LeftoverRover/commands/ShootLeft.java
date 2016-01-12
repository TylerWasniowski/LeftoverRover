// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc2813.LeftoverRover.commands;

import org.usfirst.frc2813.LeftoverRover.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShootLeft extends Command {

	// Normal Java constructor
	// This is a good place to put the requires method
	public ShootLeft() {
		requires(Robot.shirtLauncher);
	}
	
	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.shirtLauncher.solenoidOn();
		Robot.shirtLauncher.shootLeft();
		Timer.delay(Robot.shirtLauncher.getDelay());
		Robot.shirtLauncher.retractLeft();
		Robot.shirtLauncher.solenoidOff();
	}

	// This code is basically run after each iteration of execute(), if you want a command
	// to run once and only once, you put return true;
	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return true;
	}

	// Called once after isFinished returns true
	protected void end() {
		
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
	
}