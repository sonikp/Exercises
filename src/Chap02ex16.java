import java.util.Scanner;


public class Chap02ex16

/*
 * Michael Floerchinger
 * 
 * Exercise 2.16
 * 
 * Comparing Integers: Write an application that asks the user
 * enter two integers, obtains them from the user and displays 
 * the larger number followed by "is larger"
 * 
 * 
 */
{
	public static void main(String[] args)
	{
		// create a scanner object
		Scanner scannerName = new Scanner(System.in);
		
		// Ask user for input
		System.out.println("Comparing Integers: ");
		System.out.print("pls enter an integer: ");
		// Create & store input as a variable
		int num1 = scannerName.nextInt();
		
		// Ask user for input
		System.out.print("pls enter another integer: ");
		// Create & store input as a variable
		int num2 = scannerName.nextInt();
				
		if ( num1 > num2)
		{
			System.out.println("1st number " + num1 + " is larger than 2nd number " + num2);
		}
		
		if ( num2 > num1)
		{
			System.out.println("2nd number " + num2 + " is larger than 1st number " + num1);
		}
		
		if ( num1 == num2)
		{
			System.out.println("Both numbers " + num1 + " & the number " + num2 + " are equal");
		}
		
		// Closes scanner
		if(scannerName != null) 
		{
		    scannerName.close();
		}
		
	}
}