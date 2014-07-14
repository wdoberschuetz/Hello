import java.util.Scanner;

public class apples {
	public static void main(String args[]){
		
		Scanner a = new Scanner(System.in);
		String imie, nazwisko;
		int wiek;
		
		System.out.println("Podaj swoje imiê: ");
		imie = a.next();
		
		System.out.println("Podaj swoje nazwisko: ");
		nazwisko = a.next();
				
		System.out.println("Podaj swój wiek: ");
		wiek = a.nextInt();
		
		System.out.println("Twoje imiê, nazwisko i wiek, to: ");
		
		a.close();
	}
}
