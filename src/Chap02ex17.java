import java.util.Scanner;


public class Chap02ex17

/*
 * Michael Floerchinger
 * 
 * Exercise 2.17
 * 
 * Arithmetic, smallest/largest. Write an app that inputs 3 integers from
 * the user and displays the sum, average, product, smallest, largest.
 * 
 * 
 */
{
	public static void main(String[] args)
	{
		// set up variables
		int num1;
		int num2;
		int num3;
		int sum;
		int average;
		int product;
		int smallest = 0;
		int largest = 0;
		
		// set up scanner object
		Scanner input = new Scanner(System.in);
		
		// user message detailing what this app does
		System.out.println("Arithmetic, smallest/largest. Pls enter 3 integers");
		
		// ask user for input 1.
		System.out.print("pls enter an integer: ");
		// store integer in variable
		num1 = input.nextInt();
		
		// ask user for input 2.
		System.out.print("pls enter a 2nd integer: ");
		// store integer in variable
		num2 = input.nextInt();
		
		// ask user for input 3.
		System.out.print("pls enter a 3rd integer: ");
		// store integer in variable
		num3 = input.nextInt();
		
		// debug line to check input
		// System.out.printf("%d %d %d", num1, num2, num3);
		
		// calculation section
		
		sum = num1 + num2 + num3;
		average = (num1 + num2 + num3) / 3;
		product = num1 * num2 * num3;
		
		// display output
		System.out.printf(" sum = %d%n average = %d%n product = %d%n", sum, average, product);
		
		// find largest number
		if ( num1 > num2 && num1 > num3 )
		{
			largest = num1;
		}
		if ( num2 > num1 && num2 > num3)
		{
			largest = num2;
		}
		if ( num3 > num1 && num3 > num2)
		{
			largest = num3;
		}
		
		System.out.println("Largest number is: " + largest);
		
		// find smallest number
		if ( num1 < num2 && num1 < num3 )
		{
			smallest = num1;
		}
		if ( num2 < num1 && num2 < num3)
		{
			smallest = num2;
		}
		if ( num3 < num1 && num3 < num2)
		{
			smallest = num3;
		}
		
		System.out.println("Smallest number is: " + smallest);
		
		// Closes scanner
		if(input != null) 
		{
		    input.close();
		}
	}
}