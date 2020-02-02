/* ask the user for input determining whether to use imperial or metric system
 * get the weight from user
 * set the weight for user
 * get the height from user
 * set the height for user
 * if int height is negative exit
 * if int weight is negative exit
 * ask user for valid value until value is given
 * calculator BMI for imperial = pounds * 703 / inches * inches
 * calculator BMI for metric = kilograms / meters * meters
 * Determine what BMI index number belongs to
 * print BMI
 * Print category of BMI index
 */
import java.util.*;

public class BMICalculator {
	
	Scanner sc = new Scanner(System.in);
	double weight;
	double height;
	double bmi;
	int choice;
	
public void readUserData() {
	
	System.out.println(" Would you like to use lbs or kgs?");
	
	do {
		System.out.println(" 1. BMI = (703 x lbs / inches x inches");
		System.out.println(" 2. BMI = (Kgs / meters x meters");
		System.out.println("Please enter choice now ");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1: 
				System.out.println("Enter a weight in pounds");
				weight = sc.nextDouble();
				System.out.println("Please enter a height in inches");
				height = sc.nextDouble();
				calculateBmi();
				break;
			case 2 :
				System.out.println("Enter a weight in kilograms");
				weight = sc.nextDouble();
				System.out.println("Enter a height in meters");
				height = sc.nextDouble();
				calculateBmi();
				break;
				
			default : 
				System.out.println("invalid choice, please use choice 1 or 2");	
		}	
	}

		while(choice != 1 && choice != 2);
}
		
	public double calculateBmi() {
		
	bmi = (703 * weight) / (height * height);
		return bmi;
		}
		
	public void displayBmi() {
			System.out.println("Your BMI is " + bmi);
		if(bmi < 18.5) {
		System.out.println("You are underweight");
		} else if (bmi < 25) {
			System.out.println("You are normal weight");
		} else if (bmi < 30) {
			System.out.println("You are overweight");
		} else {
			System.out.println("You are obese");
		}
}
}



	
