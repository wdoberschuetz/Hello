//Bill calculator: Ask the user to enter 2 numbers, then add them,
//then ask the user if he wants to add more to his bill, add the third number
//ask again and so on till the user says: no, and then tell the user how much he owes. 

package DrugieZadania;

import javax.swing.JOptionPane;

public class Billing {
	
	public static void main (String[] args){
		
		double sumOfTheBill = 0;
		String itemPriceString;
		boolean decision = false;
		String decisionInput;
		
		do {
			itemPriceString = JOptionPane.showInputDialog("Enter your item's price");
			double itemPrice = Double.parseDouble(itemPriceString);
			sumOfTheBill = sumOfTheBill + itemPrice; //sumOfTheBill =+ itemPrice;
			decisionInput = JOptionPane.showInputDialog("Do you want to put another item? Yes, no?");
			if (decisionInput.equals("Yes") || decisionInput.equals("y")){
				decision = true;
			}
			else{
				decision = false;
			}
			}
		
		while (decision);
		
		JOptionPane.showMessageDialog(null, sumOfTheBill);
		
	}

}
