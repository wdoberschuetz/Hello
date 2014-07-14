//22. Modify your BMI program and ask the user for their age.
//Assume that the BMI rule only applies to ppl between 18 and 60.

import javax.swing.*;

public class Task22 {
	public static void main(String args[]){
		
		String ageString = JOptionPane.showInputDialog("Enter your age: ");
		int age = Integer.parseInt(ageString);
		
		int MIN_AGE = 18;
		int MAX_AGE = 60;
		int MIN_BMI = 20;
		int MAX_BMI = 25;
		
		if(age > MIN_AGE && age < MAX_AGE){
		
			//defining strings of height and weight
			String heightString = JOptionPane.showInputDialog("Enter your height [m]");
			String weightString = JOptionPane.showInputDialog("Enter your weight [kg]");
		
			//changing string to a double, so that height can be into a number with a decimal point
			double height = Double.parseDouble(heightString);
			double weight = Double.parseDouble(weightString);
			double BMI = 0;
		
			//formula for BMI
			BMI = (weight/(height*height));
		
			if (BMI<= MIN_BMI){
			JOptionPane.showMessageDialog(null, "You have anorexia.");
			}
			else if (BMI>MIN_BMI && BMI <MAX_BMI){
			JOptionPane.showMessageDialog(null, "You are alright girl.");
			}
			else if (BMI>= MAX_BMI){
			JOptionPane.showMessageDialog(null, "You are obese girl... get to work.");
			}
			
			}
		else{ // closing up the first if
			JOptionPane.showMessageDialog(null, "BMI does not apply to you!");
		}
	}
}