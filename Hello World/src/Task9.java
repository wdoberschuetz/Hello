import java.util.Scanner;

public class Task9 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		String name, surname, email;
		
		System.out.println("Enter your name: ");
		name = input.next();
		
		System.out.println("Enter your surname: ");
		surname = input.next();
		
		System.out.println("Enter your e-mail address: ");
		email = input.next();
		
		System.out.printf("Your name, surname and e-mail address are: %s %s, %s", name, surname, email);
				
	}
}
