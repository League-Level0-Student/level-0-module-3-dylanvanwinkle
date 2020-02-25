package _05_horoscope;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Horoscope {
	public static void main(String[] args) {

		String star = JOptionPane.showInputDialog("What is your star sign?");

		if (star.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "If you try to be objective, you'll realize that this isn't true.");
		} else if (star.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, " Hang in there!");
		} else if (star.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "Keep yourself busy at home.");

		} else if (star.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "You should be back to normal in a few days.");

		} else {
JOptionPane.showMessageDialog(null, "Thats not may not be a star sign.");
		}
	
	}
}
