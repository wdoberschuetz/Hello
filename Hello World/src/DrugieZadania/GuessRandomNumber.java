//1) Program's name is GuessTheNumber and you are to generate a random number,
//then ask the user to guess it,
//and then tell the user if the number he/she guessed is higer/lower than the generated random number. 

package DrugieZadania;

import java.util.Random;

import javax.swing.JOptionPane;

public class GuessRandomNumber {

	public static void main (String[] args){
		
		int numberToBeGuessed; //defining the int
		Random numberGenerated = new Random(); //creating an object
		
		numberToBeGuessed = numberGenerated.nextInt(10); //the number in the bracelets is saying what number can be generated, starting, as always, from 0
		
		String inputNumberString = JOptionPane.showInputDialog("Guess what number computer made up ranged 0-9?");
		int inputNumber = Integer.parseInt(inputNumberString); //JOptionPane can only process String, so I'm using String from a user and here I'm making it an int
		
		//now telling if it's lower or higher
		if (inputNumber > numberToBeGuessed){
			JOptionPane.showMessageDialog(null, "The number you provided is bigger than the one that computer made up. Which is: " + numberToBeGuessed);
		}
		else if (inputNumber == numberToBeGuessed){
			JOptionPane.showMessageDialog(null, "That is correct! It is" + numberToBeGuessed);
		}
		else{
			JOptionPane.showMessageDialog(null, "The number you provided is smaller than the one that computer made up. Which is: " + numberToBeGuessed);
		}
	}
	
}
