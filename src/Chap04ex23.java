import java.util.Scanner;

public class Chap04ex23
/*
 * ex 4. 23
 * 
 * pseudocode
 * 
 * is num1 larger than num2 store num1 in num2 
 * is num2 larger than num3 store num2 in num3
 * 
 */
{
	public static void main(String[] args)
	{
		System.out.println("Ex 4.23 Find the 2 largest number");
		System.out.println("-------------------------------");
		System.out.println("Enter 5 numbers 1 at a time");
		
		int numInput = 0;
		int largest = 0;
		int extraLargest = 0;
		
		// create scanner object
		Scanner scannerInput = new Scanner(System.in);
		
		for ( int i = 1; i <= 5; i++ )
		{
			System.out.print("Please enter a number : (" + i + ")\t" );
			// receive numbers
			numInput = scannerInput.nextInt();
			System.out.println(largest + "\t" + extraLargest);
			
			if ( numInput > largest )
			{
				

				largest = numInput;
				extraLargest = largest;
				System.out.println("largest\t" + largest);
				/*
				if ( largest > extraLargest )
				{
					int temp = extraLargest;
					extraLargest = largest;
					largest = temp;
					System.out.println("extraLargest\t" + extraLargest);
				}
				*/
			}
			
			else if ( numInput > extraLargest )
			{
				extraLargest = numInput;
			}

		}
		
		System.out.println("Largest number you entered was: " + extraLargest);
		System.out.println("Second largest number you entered was: " + largest);
		
	}
}