//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot

		Robot bob = new Robot("batman");
		// 3. Ask the user what color they would like the robot to draw
		for (; true;) {
			String color = JOptionPane
					.showInputDialog("What color whould you like the robot to draw? (Red Green or Blue)");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (color.equalsIgnoreCase("red")) {
				bob.setPenColor(255, 0, 0);
			} else if (color.equalsIgnoreCase("green")) {
				bob.setPenColor(0, 255, 0);
			} else if (color.equalsIgnoreCase("blue")) {
				bob.setPenColor(0, 0, 255);
			} else {
				bob.setRandomPenColor();

			}
			// 6. If the user doesn’t enter anything, choose a random color

			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10
			bob.setPenWidth(10);
			// 2. Make the robot draw a shape (this will take more than one line of code)
			bob.penDown();
			bob.setSpeed(16);
			for (int i = 0; i < 4; i++) {
				bob.move(100);
				bob.turn(90);
			}
			bob.penUp();
		}

	}
}