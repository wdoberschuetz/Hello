//21. Ask the user for their age and tell them
//what age they will be in 2019, 2024, 2029 using for loop. 

import javax.swing.*;

public class Task21 {
	public static void main(String argsp[]){
		
		String ageString = JOptionPane.showInputDialog("Enter your age here please.");
		
		int age = Integer.parseInt(ageString);
		
		for (int year = 2014; year < 2030; age += 5, year += 5){
			JOptionPane.showMessageDialog(null, String.format("In year %d you will be %d", year, age));
		}
		
	}
}
