import java.util.Scanner;

public class zamianaTemperatury {
	public static void main(String[] args){
		
		Scanner wejscie = new Scanner(System.in);
		double temperatura = 0;				//definiujê liczbê, któr¹ pobierze
		double odpowiedŸ = 0;				//definiujê odpowiedŸ
		String rodzajTemperatury;		//definiujê wybór Celsjusz, czy Fahrenheit
		
		System.out.println("Wybierz, czy chcesz zamieniæ temperaturê na stopnie Celsjusza (C) czy stopnie Fahrenheita (F):");
		rodzajTemperatury = wejscie.next();
		
		System.out.println("Podaj temperaturê, któr¹ chcesz zamieniæ");
		temperatura = wejscie.nextDouble();
		
		if (rodzajTemperatury.equals("C")) {
			odpowiedŸ = ((temperatura-32)*5/9);
			System.out.println(odpowiedŸ);
		}
		else if (rodzajTemperatury.equals("F")) {
			odpowiedŸ = ((temperatura+32)*9/5);
			System.out.println(odpowiedŸ);
		}
		
		else {
			System.out.println("le wpisana, wybierz C lub F!");
		}
		
	}
}
