//25. Ask the user to enter day of the week.
//If its monday sa its beginning of the week. if its sat or sun say its weekend.
//else - midweek. use switch statement. 

import javax.swing.*;

public class Task25 {
	public static void main(String args[]){
		
		String dayOfTheWeek = JOptionPane.showInputDialog("Tell me what day of the week is it? (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)");
		
		switch (dayOfTheWeek){
		case "Monday":
			JOptionPane.showMessageDialog(null, "It's the beginning of the week");
			break;
		case "Saturday":
		case "Sunday":
			JOptionPane.showMessageDialog(null, "It's weekend!");
			break;
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			JOptionPane.showMessageDialog(null, "It's midweek:(!");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Please review your input.");
			break;
		}
		
	}
}
