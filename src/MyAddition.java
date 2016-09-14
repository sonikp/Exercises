import java.util.Scanner;

// My program for Addition.java

public class MyAddition
{
	public static void main (String[] args)
	{
		//System.out.println("Test");

		
		
		// Create a scanner to obtain input
		Scanner input = new Scanner(System.in);	

		int number1;
		int number2;
		int sum;
		
		System.out.print("\n enter 1st integer: \t ");
		number1 = input.nextInt();
		
		System.out.print("\n enter 2nd integer: \t ");
		number2 = input.nextInt();
		
		System.out.println("\n You just entered: " + number1 + "\t" + number2);
		
		sum = number1 + number2;
		
		System.out.println("\n Added together the total is: " + sum + "\n\n");
		
		// Closes scanner
		if(input != null) {
		    input.close();
		}
	
	}

}