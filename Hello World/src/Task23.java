//23. Ask the user to enter 3 numbers and tell them whether those numbers would make a triangle. 

import javax.swing.JOptionPane;

public class Task23 {
	public static void main(String args[]){
		
		String firstNumberString = JOptionPane.showInputDialog("Enter here first number");
		String secondNumberString = JOptionPane.showInputDialog("Enter here second number");
		String thirdNumberString = JOptionPane.showInputDialog("Enter here third number");
		
		double firstNumber = Double.parseDouble(firstNumberString);
		double secondNumber = Double.parseDouble(secondNumberString);
		double thirdNumber = Double.parseDouble(thirdNumberString);
		
		//triangle can't be made if a sum any of the two sides is shorter than the third side
		//so I'm covering that in if statement
		if (firstNumber + secondNumber < thirdNumber ||
				firstNumber + thirdNumber < secondNumber ||
				secondNumber + thirdNumber < firstNumber){
			JOptionPane.showMessageDialog(null, "You cannot make a triangle!");
		}
		else{
			JOptionPane.showMessageDialog(null, "You can make a triangle girl!");
		}
		
	}
}
