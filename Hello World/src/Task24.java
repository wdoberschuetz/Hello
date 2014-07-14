// 24. Ask the user to enter a radius, then ask if they want to calculate
// sphere or area of a circle and tell them result of the calculation.

import javax.swing.*;

public class Task24 {
	public static void main(String args[]){
		
		String radiusString = JOptionPane.showInputDialog("Enter the radius");
		String areaString = JOptionPane.showInputDialog("Enter 'S' to calculate sphere area and 'C' for area of a circle");
		
		double radius = Double.parseDouble(radiusString);
		double sphereVolume = 0;
		double circleArea = 0;
		
		sphereVolume = (4/3)*3.14*radius*radius*radius;
		circleArea = 3.14*radius*radius;
		
		if (areaString.equals("C") || areaString.equals("c")){
			JOptionPane.showMessageDialog(null, String.format("%.2f", circleArea));
		}
		else{
			JOptionPane.showMessageDialog(null, String.format("%.2f", sphereVolume));
		}
	}
}
