import java.util.Scanner;

public class Chap02ex30

/*
 * Michael Floerchinger
 * 
 * Exercise 2.30
 * 
 * Separating Digits in an Integer, input a number and 
 * redisplay with a space between each character in 
 * the same sequential order
 * 
 */

{
	public static void main(String[] args)
	{
		// create a scanner for user input
		Scanner scannerInput = new Scanner(System.in);
		
		// Usage information and application purpose
		System.out.println("Separating Digits in an Integer\n");
		
		// get user input
		System.out.print("Please enter a long number: ");
				
		// assign input to variable & create other variables
		int number = scannerInput.nextInt();
		int output;
		int i; // I purposely made i bigger in case QA test tries a number bigger than 5 char :)
		
		// Used to display results
		System.out.print("\nRedisplayed as: \t ");
		
		for (i=1000000000; i >= 1; i = i / 10 )
		{
			output = number / i;
			if ( output != 0 )
			{
				number = number - (output * i);
				System.out.print(output + " ");
			}
		}
		
		// closes scanner
		if (scannerInput != null)
		{
			scannerInput.close();
		}

	}
}