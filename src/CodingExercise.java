import java.util.Random;

import javax.swing.JOptionPane;

public class CodingExercise {
	public static void main(String[] args) {
		Random wee = new Random();
		int woo = wee.nextInt(101);
		System.out.println(woo);

		String num = JOptionPane.showInputDialog("Give me a numero.");
		int ten = Integer.parseInt(num);
		System.out.println(ten * 10);
	}

}
