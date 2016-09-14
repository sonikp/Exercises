import java.util.Scanner;

public class Chap05ex17
{
	
	private static Scanner scannerInput;		// creates the input scanner, not instantiated until the main method is called
	
	
	public static void main(String[] args)
	{
		/*
		 * ex 5.17
		 * Calculating Sales
		 * 
		 */
		
		// create product variables
		double prodValue1 = 2.98;
		double prodValue2 = 4.50;
		double prodValue3 = 9.98;
		double prodValue4 = 4.49;
		double prodValue5 = 6.87;
		int prodNum1 = 1;
		int prodNum2 = 2;
		int prodNum3 = 3;
		int prodNum4 = 4;
		int prodNum5 = 5;
		
		// create user variables
		int userInput;
		
		// test product variables
		System.out.println(prodValue1);

		// create scanner object
		scannerInput = new Scanner(System.in);
		
		// test scanner method
		System.out.print("enter number:\t");
		userInput = getInput();
		
		System.out.println("your input was " + userInput);
			
		// readProductQuantity
		System.out.println("please enter both prod# and quantity");
		System.out.print("prod number: \t");
		int prodNum = getInput();
		System.out.print("quantity:\t");
		int quantity = getInput();
		
		// display input
		System.out.println("you entered - prodNum: \t" + prodNum);
		System.out.println("you entered - quatity: \t"+ quantity);
		
		
		/*
		 * Pseudo code:
		 * online retailer sells 5 products:
		 * Product1: $2.98, Product2: $4.50
		 * 
		 * Write a program that reads a series of pairs of number as follows:
		 * 		a) product number
		 * 		b) quantity sold 
		 * 
		 * Use 'switch' statement to determine the price for each product
		 * Use sentinel controlled loop to determine when the program should stop looping and 
		 * display final results
		 * 
		 * pseudocode 2:
		 * 
		 * initialize variables for products
		 * initialize variables for reading pairs of numbers: product numbers, quantity sold
		 * initialize 
		 * 
		 * create logic 
		 */
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public static int getInput()
	{
		// Scanner scannerInput = new Scanner (System.in); 	// changed for troubleshooting
		// System.out.print("Enter Value: ");
		// numberOf = scannerInput.nextInt();
		return scannerInput.nextInt();			//numberOf
	}
	
	public static int prodMatch(int prodNum)
	{
		System.out.println("from Method prodMatch \t" + prodNum);
	}
}