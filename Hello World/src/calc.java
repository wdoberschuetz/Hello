import java.util.Scanner;

public class calc {
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		int fnum, snum, odp;
		
		System.out.println("Podaj pierwsz¹ liczbê: ");
		fnum = p.nextInt();
		
		System.out.println("Podaj drug¹ liczbê:");
		snum = p.nextInt();
		
		odp = fnum + snum;
		
		System.out.print("Twoja odpowiedŸ to: ");
		System.out.println(odp);
	}
}
