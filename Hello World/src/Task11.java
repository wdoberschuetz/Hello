import javax.swing.*;

public class Task11 {
	public static void main(String args[]){
		
		String name = JOptionPane.showInputDialog(null, "Enter your name here:");
		String surname = JOptionPane.showInputDialog(null, "Enter your surname here:");
		
		//String result = String.format("Your name and surname are: %s %s", name, surname);
		
		JOptionPane.showMessageDialog(null, String.format("Your name and surname are: %s %s", name, surname)); 
		
	}
}
