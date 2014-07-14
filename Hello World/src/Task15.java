import javax.swing.*;

public class Task15 {
	public static void main(String args[]){

		String firstNumberString = JOptionPane.showInputDialog("Enter your first number:");
		String secondNumberString = JOptionPane.showInputDialog("Enter your 2nd number:");
		String thirdNumberString = JOptionPane.showInputDialog("Enter your 3rd number:");
		
		int firstNumber = Integer.parseInt(firstNumberString);
		int secondNumber = Integer.parseInt(secondNumberString);
		int thirdNumber = Integer.parseInt(thirdNumberString);
		
		int smallestNumber = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
		
		JOptionPane.showMessageDialog(null, "The smallest of these three is: " + smallestNumber);	
		
	}
	
}
