import java.util.Scanner;

public class Zadanie7 {
	public static void main(String args[]){
		
		Scanner enter = new Scanner(System.in);
		String text, letter;
		
		System.out.println("Enter the text here: ");
		text = enter.next();
		
		System.out.println("Enter the letter to be checked: ");
		letter = enter.next();
		
		boolean result = text.contains(letter);
		System.out.println(result);
		
	}
}
