import java.util.Scanner;

public class Zadanie6 {
	public static void main(String args[]){
		
		Scanner wej�cie = new Scanner(System.in);
		String tekst;
		int znak = 0;
		
		System.out.println("Podaj swoje imi�, nazwisko lub cokolwiek: ");
		tekst = wej�cie.next();
		
		System.out.println("Podaj, kt�r� z kolei liter� ma Ci wy�wietli�: ");
		znak = wej�cie.nextInt();
		
		System.out.println("Znak numer " + znak + " to: ");
		System.out.println(tekst.charAt(znak - 1));
		
	}
}
