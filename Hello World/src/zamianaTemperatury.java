import java.util.Scanner;

public class zamianaTemperatury {
	public static void main(String[] args){
		
		Scanner wejscie = new Scanner(System.in);
		double temperatura = 0;				//definiuj� liczb�, kt�r� pobierze
		double odpowied� = 0;				//definiuj� odpowied�
		String rodzajTemperatury;		//definiuj� wyb�r Celsjusz, czy Fahrenheit
		
		System.out.println("Wybierz, czy chcesz zamieni� temperatur� na stopnie Celsjusza (C) czy stopnie Fahrenheita (F):");
		rodzajTemperatury = wejscie.next();
		
		System.out.println("Podaj temperatur�, kt�r� chcesz zamieni�");
		temperatura = wejscie.nextDouble();
		
		if (rodzajTemperatury.equals("C")) {
			odpowied� = ((temperatura-32)*5/9);
			System.out.println(odpowied�);
		}
		else if (rodzajTemperatury.equals("F")) {
			odpowied� = ((temperatura+32)*9/5);
			System.out.println(odpowied�);
		}
		
		else {
			System.out.println("�le wpisana, wybierz C lub F!");
		}
		
	}
}
