package extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot mech = new Robot();
		// 2. Set the speed to 100
		mech.setSpeed(900);
		mech.penDown();
		int colorChoice = JOptionPane.showOptionDialog(null, "Quelle colour?", "BYG", JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "Blue", "Yellow", "Green" }, 0);

		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly
		if (colorChoice == 0) {
			mech.setPenColor(0, 0, 255);

		}

		if (colorChoice == 1) {
			mech.setPenColor(255, 255, 0);

		}

		if (colorChoice == 2) {
			mech.setPenColor(0, 255, 0);

		}
		// 4. Ask the use how many polygons they want to be drawn.
		String poly = JOptionPane.showInputDialog("How many polygons is you want?");
		int gon = Integer.parseInt(poly);
		// 5. Use the robot to draw the number of polygons the user requested.
		if (gon == 100) {
			for (int i = 1; i < 101; i++) {
				mech.move(60);
				mech.turn(90);
				mech.move(60);
				mech.turn(90);
				mech.move(60);
				mech.turn(90);
				mech.move(60);
				mech.turn(90);
				/*
				 * mech.turn(45); mech.move(100); mech.turn(100); mech.move(100);
				 * mech.turn(130); mech.move(100);
				 */
				mech.penUp();
				mech.move(100);
				mech.penDown();
				mech.turn(20);
			}
		}
		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.
	}
}
