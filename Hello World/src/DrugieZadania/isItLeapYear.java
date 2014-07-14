/*4) ask the uset to enter a  year and tell them if the year is a leap year. */

package DrugieZadania;

import javax.swing.JOptionPane;

public class isItLeapYear {

	public static void main(String[] args) {
		
		String yearString = JOptionPane.showInputDialog("Enter the year if you want to find out if it's a leap year!");
		int year = Integer.parseInt(yearString);
		
		
		if (year%4 == 0 && year%100 != 0 || year%400 == 0) { // ? "This year is a leap year" : "This is not a leap year");
			JOptionPane.showMessageDialog(null, "Year " + year + " is a leap year!");
		}
		
		else{
			JOptionPane.showMessageDialog(null, "Year " + year + " is NOT a leap year!");
		}
			
	}

}
