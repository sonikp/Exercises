import java.util.Scanner;

public class Chap02ex25

/*
 * Michael Floerchinger
 * 
 * Exercise 2.25
 * 
 * Odd / Even
 * Write an application that reads an integer and determines whether it is odd or 
 * even
 * 
 */

{
	public static void main(String[] args)
	{
		int usrInput; 	// user input
		int divResult;	// remainder after %2
		String message = "";	// Odd or even message
		
		// Create scanner object
		Scanner scannerInput = new Scanner(System.in);
		
		// Provide usage information
		System.out.print("Odd / Even:: Application that reads an integer ");
		System.out.print("and \ndetermines whether it is odd or even\n");
		
		// get user input
		System.out.print("Pls enter a number: ");
		// store input as a variable
		usrInput = scannerInput.nextInt();
		
		// test for odd / even
		divResult = usrInput % 2;
		
		if ( divResult == 1)
		{
			message = "\"Odd\"";
		}
		if ( divResult == 0)
		{
			message = "\"Even\"";
		}
		
		// display results
		System.out.println("You entered " + usrInput + "\nThis is an " + message + " number!");
		
		if(scannerInput != null) 
		{
			scannerInput.close();
		}
			
	}
}