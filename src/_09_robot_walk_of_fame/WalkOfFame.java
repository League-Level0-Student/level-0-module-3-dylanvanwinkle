
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _09_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot a = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		a.setX(40);
		// 2. Make the robot draw a star shape. Hint: 144.
		a.setSpeed(100);
		a.penDown();
		for (int i = 0; i < 6; i++) {
			a.penDown();
			a.setPenWidth(30);
			a.move(30);
			a.turn(144);
		}
		a.hide();
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}
}
