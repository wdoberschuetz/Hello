import javax.swing.*;

public class Task14 {
	public static void main(String args[]){
		
		String toWhatChanges = JOptionPane.showInputDialog("Enter C if you wish to change to Celsius, or F if you wish to change to Fahrenheit.");
		String temperatureInput = JOptionPane.showInputDialog("Enter the temperature.");
		
		int temperatureInt = Integer.parseInt(temperatureInput);
		int result = 0;
		
		if (toWhatChanges.equals("F")){
			result = ((temperatureInt*9/5)+32);
			JOptionPane.showMessageDialog(null, result);
		}
		else if (toWhatChanges.equals("C")){
			result = ((temperatureInt-32)*5/9);
			JOptionPane.showMessageDialog(null, result);
		}
		
	}
}
