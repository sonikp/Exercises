import java.util.Scanner;

public class Chap02ex24

/*
 * Michael Floerchinger
 * 
 *  Exercise 2.24
 *  
 *  Write an application to read, print and find largest, smallest of 5 digits
 */

{
	public static void main(String[] args)
	{
		// create scanner object
		Scanner scannerInput = new Scanner(System.in);
		
		// Application usage information
		System.out.print("Application to read, print and find largest, smallest of 5 digits\n");
		
		// Get user input
		System.out.print("pls enter 1st digit: ");
		// store user i/p as a variable
		int ip1 = scannerInput.nextInt();
		
		System.out.print("pls enter 2nd digit: ");
		// store user i/p as a variable
		int ip2 = scannerInput.nextInt();
		
		System.out.print("pls enter 3rd digit: ");
		// store user i/p as a variable
		int ip3 = scannerInput.nextInt();
		
		System.out.print("pls enter 4th digit: ");
		// store user i/p as a variable
		int ip4 = scannerInput.nextInt();
		
		System.out.print("pls enter 5th digit: ");
		// store user i/p as a variable
		int ip5 = scannerInput.nextInt();
		
		// create variables for largest/smallest numbers
		int largest = 0;
		int smallest = 0;
		
		// test for largest number
		if ( (ip1 > ip2) && (ip1 > ip3) && (ip1 > ip4) && (ip1 > ip5))
		{
			largest = ip1;
		}
		if ( (ip2 > ip1) && (ip2 > ip3) && (ip2 > ip4) && (ip2 > ip5))
		{
			largest = ip2;
		}
		if ( (ip3 > ip1) && (ip3 > ip2) && (ip3 > ip4) && (ip3 > ip5))
		{
			largest = ip3;
		}
		if ( (ip4 > ip1) && (ip4 > ip2) && (ip4 > ip3) && (ip4 > ip5))
		{
			largest = ip4;
		}
		if ( (ip5 > ip1) && (ip5 > ip2) && (ip5 > ip3) && (ip5 > ip4))
		{
			largest = ip5;
		}
		
		System.out.println("Largest number is: " + largest);
		
		// test for smallest number
		if ( (ip1 < ip2) && (ip1 < ip3) && (ip1 < ip4) && (ip1 < ip5))
		{
			smallest = ip1;
		}
		if ( (ip2 < ip1) && (ip2 < ip3) && (ip2 < ip4) && (ip2 < ip5))
		{
			smallest = ip2;
		}
		if ( (ip3 < ip1) && (ip3 < ip2) && (ip3 < ip4) && (ip3 < ip5))
		{
			smallest = ip3;
		}
		if ( (ip4 < ip1) && (ip4 < ip2) && (ip4 < ip3) && (ip4 < ip5))
		{
			smallest = ip4;
		}
		if ( (ip5 < ip1) && (ip5 < ip2) && (ip5 < ip3) && (ip5 < ip4))
		{
			smallest = ip5;
		}
		
		System.out.println("Smallest number is: " + smallest);
		
		// Closes scanner
		if(scannerInput != null) 
		{
			scannerInput.close();
		}
	}
}