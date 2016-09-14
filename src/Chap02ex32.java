import java.util.Scanner;

public class Chap02ex32

/*
 * Michael Floerchinger
 * 
 * Exercise 2.32
 * 
 * Negative, positive, and zero value
 * 
 */

{
	public static void main(String[] args)
	{
		// create a scanner object
		Scanner scannerInput = new Scanner(System.in);
		
		// set up integers
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		String value1 = "";
		String value2 = "";
		String value3 = ""; 
		String value4 = "";
		String value5 = "";
		int countPlus = 0;
		int countMinus = 0;
		int countZero = 0;
		

		// Application purpose
		System.out.println("Takes 5 input values and displays them as ");
		System.out.println("+ve, -ve or zero values\n");
		
		// get user input 
		System.out.println("pls enter the 1st of 5 numbers, and hit enter after each number");
		System.out.print("1st number pls: ");
		// add to a variable
		num1 = scannerInput.nextInt();
		
		System.out.print("2nd number pls: ");
		// add to a variable
		num2 = scannerInput.nextInt();
		
		System.out.print("3rd number pls: ");
		// add to a variable
		num3 = scannerInput.nextInt();
		
		System.out.print("4th number pls: ");
		// add to a variable
		num4 = scannerInput.nextInt();
		
		System.out.print("5th number pls: ");
		// add to a variable
		num5 = scannerInput.nextInt();
	
		// test 1st number
		if ( num1 < 0 ) 
		{
			value1 = "                    X ";
			countMinus++;
		}
		if ( num1 == 0 ) 
		{
			value1 = "              X ";
			countZero++;
		}
		if ( num1 >= 1 ) 
		{
			value1 = "       X ";
			countPlus++;
		}
		
		// test 2nd number
		if ( num2 < 0 ) 
		{
			value2 = "                    X ";
			countMinus++;
		}
		if ( num2 == 0 ) 
		{
			value2 = "              X ";
			countZero++;
		}
		if ( num2 >= 1 ) 
		{
			value2 = "       X ";
			countPlus++;
		}

		// test 3rd number
		if ( num3 < 0 ) 
		{
			value3 = "                    X ";
			countMinus++;
		}
		if ( num3 == 0 ) 
		{
			value3 = "              X ";
			countZero++;
		}
		if ( num3 >= 1 ) 
		{
			value3 = "       X ";
			countPlus++;
		}
		
		// test 4th number
		if ( num4 < 0 ) 
		{
			value4 = "                    X ";
			countMinus++;
		}
		if ( num4 == 0 ) 
		{
			value4 = "              X ";
			countZero++;
		}
		if ( num4 >= 1 ) 
		{
			value4 = "       X ";
			countPlus++;
		}
		
		// test 5th number
		if ( num5 < 0 ) 
		{
			value5 = "                    X ";
			countMinus++;
		}
		if ( num5 == 0 ) 
		{
			value5 = "              X ";
			countZero++;
		}
		if ( num5 >= 1 ) 
		{
			value5 = "       X ";
			countPlus++;
		}
		
		System.out.println("\nnumber " + "positive " + "zero " + "negative");
		System.out.println("  " + num1 + value1);
		System.out.println("  " + num2 + value2);
		System.out.println("  " + num3 + value3);
		System.out.println("  " + num4 + value4);
		System.out.println("  " + num5 + value5);
		System.out.println("\nTotal number of +ve numbers:\t" + countPlus);
		System.out.println("Total number of -ve numbers:\t" + countMinus);
		System.out.println("Total number equal to zero:\t" + countZero);
		
		//closes scanner
		if (scannerInput != null)
		{
			scannerInput.close();
		}
		
	}
}