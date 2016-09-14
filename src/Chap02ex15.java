import java.util.Scanner;


public class Chap02ex15

/*
 * Michael Floerchinger
 * 
 * Exercise 2.15: Arithmetic
 * Write an app that asks a user to enter 2 integers, obtains them from the 
 * user, prints their sum, product, difference, quotient(division)
 * 
 */


{
	public static void main(String[] args)
	{

		// Create scanner object
		Scanner scannerName = new Scanner(System.in);
		
		// prompt user for input
		System.out.println("Exercise 2.15: Arithmetic");
		System.out.print("pls enter an integer: ");
		
		// store input to variable
		int firstInput = scannerName.nextInt();
		
		// prompt user for second input
		System.out.print("pls enter another integer: ");
		
		// store input to variable
		int secondInput = scannerName.nextInt();
		
		// -----calculation section-------
		
		// calculate sum
		int addition = firstInput + secondInput;
		
		// calculate product
		int product = firstInput * secondInput;
		
		// calculate difference
		int difference = firstInput - secondInput;
		
		// calculate quotent
		int quotent = firstInput / secondInput;
		
		// -----display results section-------
		
		System.out.println("Using the two numbers you provided in the following arithmetic expressions : ");
		System.out.println("As a sum; \t\t" + addition);
		System.out.println("As a product; \t\t" + product);		
		System.out.println("As a difference; \t" + difference);
		System.out.println("As a quotent; \t\t" + quotent);
		
		// Closes scanner
		if(scannerName != null) 
		{
		    scannerName.close();
		}
	}
}