import java.util.Scanner;

public class Task8 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		double height = 0, weight = 0, BMI = 0;
		
		System.out.println("Enter your weight: ");
		weight = input.nextDouble();
		
		System.out.println("Enter your height in centimeters: ");
		height = input.nextDouble();
		
		BMI = (weight/((height*height)/10000));
		
		if (BMI<20) {
			System.out.println("You have anorexia! Your BMI is: " + BMI);
		}
		else if (BMI>20 && BMI<25) {
			System.out.println("You are alright! Your BMI is: " + BMI);
		}
		else if (BMI>25) {
			System.out.println("You are obese! Get to work. Your BMI is: " + BMI);
		}
		else;
	}
}
