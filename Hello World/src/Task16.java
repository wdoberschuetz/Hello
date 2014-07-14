import javax.swing.*;

public class Task16 {
	public static void main(String[] args) {

		//define strings: name and letterNumberString
		String name = JOptionPane.showInputDialog("Enter your name");
		String letterNumberString = JOptionPane.showInputDialog("Enter the number of character that you wish me to show you.");
		
		//because showInputDialog takes the input as a string, I need to change to an integer
		int letterNumber = Integer.parseInt(letterNumberString);
		
		//show the result
		//charAt starts at 0, so I need to detract one from the number you give
		JOptionPane.showMessageDialog(null, letterNumber + " litera to: " + name.charAt(letterNumber - 1));
		
	}

}
