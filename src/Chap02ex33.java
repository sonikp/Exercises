import java.util.Scanner;

/*
 * Michael Floerchinger
 * 
 * Exercise 2.33
 * BMI calculator
 * 
 */

public class Chap02ex33
{
	public static void main(String[] args)
	{
		// create a scanner object
		Scanner scannerInput = new Scanner(System.in);
		
		// provide application description
		System.out.println("BMI calculator: pls enter weight in lbs and height in inches");
		System.out.print("Weight in lbs?:\t\t");
		// create a variable to store weight
		double weight = scannerInput.nextInt();
		
		System.out.print("Height in inches?:\t");
		// create a variable to store height
		double height = scannerInput.nextInt();
		
		double BMI = (weight * 703) / (height * height);
		
		System.out.println("\n----Rating Scale----");
		System.out.println("Underweight:\t less than 18.5");
		System.out.println("Normal:\t\t between 18.5 & 24.9");
		System.out.println("Overweight:\t between 25 & 29.9");
		System.out.println("Obese:\t\t 30 or greater");
		System.out.println("------------------------\n");
		System.out.println("Your BMI is: \t " + BMI);
		
		if ( BMI < 18.5 )
		{
			System.out.println("You're considered \"Underweight\"");
		}
		if ( (BMI > 18.5) && (BMI < 24.9) )
		{
			System.out.println("You're considered \"Normal\"");
		}
		if ( (BMI > 25) && (BMI < 29.9) )
		{
			System.out.println("You're considered \"Overweight\"");
		}
		if ( BMI > 30 )
		{
			System.out.println("You're considered \"Obese\"");
		}
		// closes scanner
		if (scannerInput != null)
		{
			scannerInput.close();
		}
	}
}