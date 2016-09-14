import java.util.Scanner;

/*
 * Michael Floerchinger
 * 
 * Exercise 2.26
 * 
 * Multiples: Write an application that reads two integers,
 * determines whether the first is a multiple of the second and 
 * prints the result
 * 
 */

public class Chap02ex26
{
	public static void main(String[] args)
	{
		// create a scanner object
		Scanner scannerInput = new Scanner(System.in);
		
		// Application usage information
		System.out.println("Multiples: Application that reads two integers, ");
		System.out.println("determines whether the first is a multiple of \nthe second and prints the result\n");
		
		// get two numbers from user
		System.out.print("pls enter a number: ");
		// pass input to 1st variable
		int num1 = scannerInput.nextInt();
		System.out.print("pls enter another number: ");
		// pass input to 2nd variable
		int num2 = scannerInput.nextInt();
		
		System.out.println("Calculating whether these are multiple variables ");
		
		int resultMain = num1 / num2;
		int resultOver = num1 % num2;
				
		if ( resultOver == 0 )
		{
			System.out.println(num2 + " is evenly divisable by " + num1);
			System.out.println("It divides evenly by " + resultMain + " times!");
		}
		else
		{
			System.out.println(num2 + " is not evenly divisable by " + num1);
		}
		
		// close scanner
		if (scannerInput != null){
			scannerInput.close();
		}
		
	}
}