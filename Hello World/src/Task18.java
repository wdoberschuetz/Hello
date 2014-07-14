import javax.swing.*;

public class Task18 {
	public static void main(String args[]){
		
		//defining strings of height and weight
		String heightString = JOptionPane.showInputDialog("Enter your height [m]");
		String weightString = JOptionPane.showInputDialog("Enter your weight [kg]");
		
		//changing string to a double, so that height can be into a number with a decimal point
		double height = Double.parseDouble(heightString);
		double weight = Double.parseDouble(weightString);
		double BMI = 0;
		
		//formula for BMI
		BMI = (weight/(height*height));
		
		if (BMI<= 20){
			JOptionPane.showMessageDialog(null, "You have anorexia.");
		}
		else if (BMI>20 && BMI <25){
			JOptionPane.showMessageDialog(null, "You are alright girl.");
		}
		else if (BMI>= 25){
			JOptionPane.showMessageDialog(null, "You are obese girl... get to work.");
		}
		
	}
}
