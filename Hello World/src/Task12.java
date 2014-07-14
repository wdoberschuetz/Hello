import javax.swing.*;

public class Task12 {
	public static void main(String args[]){
		
		String firstString = JOptionPane.showInputDialog("Enter the first number:");
		String secondString = JOptionPane.showInputDialog("Enter the second number:");
		
		int firstNumber = Integer.parseInt(firstString);
		int secondNumber = Integer.parseInt(secondString);
		int theResult = 0;
		
		theResult = firstNumber + secondNumber;
		
		if (theResult<10){
			JOptionPane.showMessageDialog(null, "Your result is lower than 10.");
		}
		else if (theResult == 10){
			JOptionPane.showMessageDialog(null, "Your result is exactly 10.");
		}
		else if (theResult>10){
			JOptionPane.showMessageDialog(null, "Your result is more than 10.");
		}
	}
}
