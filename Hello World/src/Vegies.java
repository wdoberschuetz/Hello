import java.util.Scanner;

public class Vegies {
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		Cucu CucuObject = new Cucu();
		
		System.out.println("Enter name of your first gf here: ");
		String temporaryVariable = input.nextLine();
		
		CucuObject.setName(temporaryVariable);
		CucuObject.saying();
		
	}
}
