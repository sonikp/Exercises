import java.util.Scanner;

public class Chap04ex21
/*
 * ex 4.21 Find the largest number
 * 
 * pseudocode
 * 
 * enter numbers 10 times
 * set a counter to count the 10 times
 * test the values one at a time
 * 
 */
{
	public static void main(String[] args)
	{
		int numInput = 0;
		int largest = 0;
		int counter;
		int i;
		
		// Create Scanner object
		Scanner scannerInput = new Scanner(System.in);
		
		System.out.println("Ex 4.21 Find the largest number");
		System.out.println("-------------------------------");
		System.out.println("Enter 10 numbers 1 at a time");
		

		
		for ( i = 1; i <= 10; i++ )
		{
			System.out.print("Please enter a number : (" + i + ")\t" );
			// receive numbers
			numInput = scannerInput.nextInt();
			
			if ( numInput > largest)
			{
				largest = numInput;
			}
		}
		
		System.out.println("Largest number you entered was: " + largest);
		
	}
}