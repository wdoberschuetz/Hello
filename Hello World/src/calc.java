import java.util.Scanner;

public class calc {
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		int fnum, snum, odp;
		
		System.out.println("Podaj pierwsz� liczb�: ");
		fnum = p.nextInt();
		
		System.out.println("Podaj drug� liczb�:");
		snum = p.nextInt();
		
		odp = fnum + snum;
		
		System.out.print("Twoja odpowied� to: ");
		System.out.println(odp);
	}
}
