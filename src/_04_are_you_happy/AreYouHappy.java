package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String answer;

		answer = JOptionPane.showInputDialog("Are you Happy?");

		if (answer.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep Doing Watever you're Doing.");
		} else if (answer.equalsIgnoreCase("No")) {

			answer = JOptionPane.showInputDialog("Do you want to be happy?");

			if (answer.equalsIgnoreCase("yes")) {

				JOptionPane.showMessageDialog(null, "Chang Something.");

			} else if (answer.equalsIgnoreCase("no")) {

				JOptionPane.showMessageDialog(null, "Keep Doing Watever you're Doing.");

			}
		}
	}
}
