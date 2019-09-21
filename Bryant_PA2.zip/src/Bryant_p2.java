import java.util.Scanner;

public class Bryant_p2 {
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		String choice;
		double BMI, weight, height;
		System.out.println("Would you like to calculate BMI using pounds or kilograms?");
		choice = scnr.next();
		
		if(choice.equals("pounds")) {
			System.out.println("please input you weight in pounds");
			weight = scnr.nextDouble();
			System.out.println("please input you height in inches");
			height = scnr.nextDouble();
			
			BMI = (703 * weight) / (Math.pow(height, 2));
			System.out.println("Your BMI is " + BMI);
			
		}
		else  {
			System.out.println("please input you weight in kilograms");
			weight = scnr.nextDouble();
			System.out.println("please input you height in meters");
			height = scnr.nextDouble();
			
			BMI = weight / (Math.pow(height, 2));
			System.out.println("Your BMI is " + BMI);
		}
		System.out.println("BMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		scnr.close();
	}
}
