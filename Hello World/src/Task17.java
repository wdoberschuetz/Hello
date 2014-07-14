import javax.swing.*;

public class Task17 {
	public static void main(String args[]){
	
		//defining text and letter so that I'd what to look for in the text provided
		String text = JOptionPane.showInputDialog("Enter the text here: ");
		String letter = JOptionPane.showInputDialog("Enter the letter you're looking for:");
		
		//the test
		boolean result = text.contains(letter);
		
		//have to use == because otherwise I'd be defining more stuff
		if (result == true){
			JOptionPane.showMessageDialog(null, "Your text contains: " + letter);
		}
		else if (result == false){
			JOptionPane.showMessageDialog(null, "Your text doesn't contain: " + letter);
		}
		
	}	
}
