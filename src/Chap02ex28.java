import java.util.Scanner;


public class Chap02ex28

/*
 * Michael Floerchinger
 * 
 * Exercise 2.28
 * Diameter, circumference, and area of a circle
 * 
 */
{
	public static void main(String[] args)
	{
		// Application usage information
		System.out.println("Used to calculate the diameter, circumference, \nand area of a circle\n");
		
		// set up variables
		
		int radius;
		double pi = Math.PI;
		
		// create  scanner object
		Scanner input = new Scanner(System.in);
		
		// ask user for input
		System.out.print("pls enter a circles radius: ");
		
		// assign user input to a variable
		radius = input.nextInt();
		
		// calculations
		System.out.println("Diameter is 2x radius: \t\t\t" + (2 * radius));
		System.out.println("Circumference is 2 x radius x PI: \t" + (2 * pi * radius));
		System.out.println("Area is PI x Radius(sqr): \t\t" + ((radius * radius) * pi));	
	
		// closes scanner
		if (input != null)
		{
			input.close();
		}
		
	}
}