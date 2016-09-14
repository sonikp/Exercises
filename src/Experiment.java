// Experiments

import java.util.Scanner;

public class Experiment
{

	// Main
	public static void main (String[] args)
	{

		// Exercise 2.5
		/* 
		 * Program to calculate product of 3 integers
		 */
		
		// Create a scanner object to take input
		Scanner input = new Scanner(System.in);
		
		// declaration of 3x variables
		int x;
		int y;
		int z;
		int result;
		
		// get user input for first integer
		System.out.print("Enter 1st integer: ");
		
		// get input and assign it to first variable
		x = input.nextInt();
		
		// get user input for first integer
		System.out.print("Enter 2nd integer: ");
		
		// get input and assign it to second variable
		y = input.nextInt();
		
		// get user input for third integer
		System.out.print("Enter 3rd integer: ");
		
		// get input and assign it to third variable
		z = input.nextInt();
		
		// Validate input
		System.out.println("You entered: " + x);
		System.out.println("You entered: " + y);
		System.out.println("You entered: " + z);
		
		// compute product of 3 variables
		result = x * y * z;
		
		System.out.printf("%s%n%s%n", "The product of all those numbers is: ", result);
		
		// end of Exercise 2.5


		
	}
	
}

