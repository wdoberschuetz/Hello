import javax.swing.*;

public class Task19 {
	public static void main(String args[]){
	
		String name = JOptionPane.showInputDialog("Enter your name:");
		String surname = JOptionPane.showInputDialog("Enter your surname:");
		String email = JOptionPane.showInputDialog("Enter your e-mail address:");
		
		JOptionPane.showMessageDialog(null, String.format("Your name, surname and e-mail are %s %s, %s.", name, surname, email));
		
	}
}
