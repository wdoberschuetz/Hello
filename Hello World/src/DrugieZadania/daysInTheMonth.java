/* Ask the user for a number corresponding to a number
 * of the month and tell them how many days that month has.
 * use switch statement. make the program as robust as possible!! */

package DrugieZadania;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class daysInTheMonth {

	public static void main(String[] args) {

		String[] numberOfMonths = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		
		String numberOfTheMonthString = JOptionPane.showInputDialog("Using a number, 1 for January, 12 for December, enter the month that lenght of you want to know");
		//int numberOfTheMonth = Integer.parseInt(numberOfTheMonthString);
		
		if (Arrays.asList(numberOfMonths).contains(numberOfTheMonthString)){
		//asList(numberOfMonths).contains(numberOfTheMonth)
		switch(numberOfTheMonthString){
			case "1": case "3": case "5": case "7": case "8": case "10": case "12":
				JOptionPane.showMessageDialog(null, "This month has 31 days.");
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "This month has 28 days.");
				break;
			case "4": case "6": case "9": case "11":
				JOptionPane.showMessageDialog(null, "This month has 30 days.");
				break;
		}//switch
		
		}//if
		else{
			JOptionPane.showMessageDialog(null, "Write between 1 and 12.");
		}//else
		
		
	}//main

}//class
