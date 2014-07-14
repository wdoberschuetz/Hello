import java.util.Scanner;

public class Zadanie6 {
	public static void main(String args[]){
		
		Scanner wejœcie = new Scanner(System.in);
		String tekst;
		int znak = 0;
		
		System.out.println("Podaj swoje imiê, nazwisko lub cokolwiek: ");
		tekst = wejœcie.next();
		
		System.out.println("Podaj, któr¹ z kolei literê ma Ci wyœwietliæ: ");
		znak = wejœcie.nextInt();
		
		System.out.println("Znak numer " + znak + " to: ");
		System.out.println(tekst.charAt(znak - 1));
		
	}
}
