import java.util.Scanner;

public class Zadanie5 {
	public static void main(String args[]){
		
		Scanner wej�cie = new Scanner(System.in);
		int pierwszaLiczba = 0;		//definiuj� sobie liczby ca�kowite
		int drugaLiczba = 0;
		int trzeciaLiczba = 0;
		
		System.out.println("Podaj pierwsz� liczb�: "); 	//pobieram pierwsz� liczb�
		pierwszaLiczba = wej�cie.nextInt();
		
		System.out.println("Podaj drug� liczb�: ");		//pobieram drug� liczb�
		drugaLiczba = wej�cie.nextInt();
		
		System.out.println("Podaj trzeci� liczb�: ");	//pobieram trzeci� liczb�
		trzeciaLiczba = wej�cie.nextInt();
		
		System.out.println("Najmniejsza liczba to: " + Math.min(pierwszaLiczba, Math.min(drugaLiczba, trzeciaLiczba)));
		
	}

}