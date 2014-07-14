import java.util.Scanner;

public class Zadanie5 {
	public static void main(String args[]){
		
		Scanner wejœcie = new Scanner(System.in);
		int pierwszaLiczba = 0;		//definiujê sobie liczby ca³kowite
		int drugaLiczba = 0;
		int trzeciaLiczba = 0;
		
		System.out.println("Podaj pierwsz¹ liczbê: "); 	//pobieram pierwsz¹ liczbê
		pierwszaLiczba = wejœcie.nextInt();
		
		System.out.println("Podaj drug¹ liczbê: ");		//pobieram drug¹ liczbê
		drugaLiczba = wejœcie.nextInt();
		
		System.out.println("Podaj trzeci¹ liczbê: ");	//pobieram trzeci¹ liczbê
		trzeciaLiczba = wejœcie.nextInt();
		
		System.out.println("Najmniejsza liczba to: " + Math.min(pierwszaLiczba, Math.min(drugaLiczba, trzeciaLiczba)));
		
	}

}