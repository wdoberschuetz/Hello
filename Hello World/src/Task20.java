//20. Ask the user for their age and
//tell them what age they will be in 2015, 16, 17, 18, and 19 using for loop.

import javax.swing.*;

public class Task20 {
	public static void main(String args[]){
		
		String ageString = JOptionPane.showInputDialog("Enter your age so I'd be able to tell what age will you be next year");
		
		int age = Integer.parseInt(ageString);
		
		for (int year = 2014; year < 2019; year++, age++){
			JOptionPane.showMessageDialog(null, String.format("In year %d you will be %d", year, age));
		}
		
	}
}
