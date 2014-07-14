/*5) bank account program, you have 3 accounts: savings, current and credit card.
 * you can withdraw and deposit money only to the current account and u cannot go below 0.
 * you can only deposit to savings and you can deposit or withdraw from credit card
 * and you can under 0 in credit card. display appropriate messages.*/

package DrugieZadania;

import javax.swing.JOptionPane;

public class BankAccount {
	
	public static void main(String[] args) {
		
		int savings = 0;
		int current = 0;
		int creditCard = 0;
		int addition = 0;
		int withdraw = 0;
		String decisionProcessString;
		String depositOrWithdrawDecisionString;
		String additionString;
		String withdrawString;
//		boolean decision = false;
		

		
		do{
		
		//	try{
			
			decisionProcessString = JOptionPane.showInputDialog
				("Choose:"
						+ "\n - current account: 'c',"
						+ "\n - savings account - 's',"
						+ "\n - credit card account - 'e'.");
		//	}
			
		//	catch(){
				
		//	}
		
		//1st possibility, CURRENT account (deposits and withdrawals possible)
		
		if (decisionProcessString.equals("c")){
			
			//below deciding if depositing or withdrawing money
			depositOrWithdrawDecisionString = JOptionPane.showInputDialog("Do you want to (d)eposit or (w)ithdraw money?");
			
				if (depositOrWithdrawDecisionString.equals("d")){ //deposit
					
					try{
						
						additionString = JOptionPane.showInputDialog(null, "How much do you want to deposit?");
						addition = Integer.parseInt(additionString);
						current = current + addition;
						
					}//try
						
					catch(NumberFormatException e){
						
						JOptionPane.showMessageDialog(null, "Please input an integer value.");
						
					}//catch
						
				}//if-depositOrWithdraw
				
				else{ //withdrawal
					
					withdrawString = JOptionPane.showInputDialog(null, "How much do you want to take out?");
					withdraw = Integer.parseInt(withdrawString);
					current = current - withdraw;
					if (current < 0){
						JOptionPane.showMessageDialog(null, "You can't withdraw that much money! You don't have enough.");
						current = current + withdraw;
					}
					
				}
			
		}//if.equals "c"
		
		//lower 2nd possibility, SAVINGS account (ONLY deposits)
		
		else if (decisionProcessString.equals("s")){
					
					try{
						
						additionString = JOptionPane.showInputDialog(null, "How much do you want to deposit?");
						addition = Integer.parseInt(additionString);
						savings = savings + addition;
						
					}//try
						
					catch(NumberFormatException e){
						
						JOptionPane.showMessageDialog(null, "Please input an integer value.");
						
					}//catch
			
		}//else if-savings account
		
		//3rd possibility, creditCard account (both deposits and withdrawals)
		
		
		else if (decisionProcessString.equals("e")){ //creditCard
			
			//below deciding if depositing or withdrawing money
			depositOrWithdrawDecisionString = JOptionPane.showInputDialog("Do you want to (d)eposit or (w)ithdraw money?");
			
				if (depositOrWithdrawDecisionString.equals("d")){ //deposit
					
					try{
						
						additionString = JOptionPane.showInputDialog(null, "How much do you want to deposit?");
						addition = Integer.parseInt(additionString);
						creditCard = creditCard + addition;
						
					}//try
						
					catch(NumberFormatException e){
						
						JOptionPane.showMessageDialog(null, "Please input an integer value.");
						
					}//catch
						
				}//if-depositOrWithdraw
				
				else{ //withdrawal
					
					withdrawString = JOptionPane.showInputDialog(null, "How much do you want to take out?");
					withdraw = Integer.parseInt(withdrawString);
					creditCard = creditCard - withdraw;
					if (creditCard < 0){
						JOptionPane.showMessageDialog(null, "You can't withdraw that much money! You don't have enough.");
						creditCard = creditCard + withdraw;
					}
					
				}
			
		}//if.equals "e"
		
		else{
			break;
		}//else
		
		}//do
		while(decisionProcessString.equals("c") || decisionProcessString.equals("s") ||
				decisionProcessString.equals("e"));
		
		/*		}//try
		
		catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Thank you.");
		}
		
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Please input an integer value.");
		}*/
		
		JOptionPane.showMessageDialog(null,
				"You have " + current + " on your current account."
				+ "\n" + "You have " + savings + " on your savings account."
				+ "\n" + "You have " + creditCard + " on your creditCard account.");
	}

}
