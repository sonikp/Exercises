
// Experiments

import java.util.Scanner;

public class Chapter2Exercises
{

	// Main
	public static void main (String[] args)
	{
		// Exercise 2.32
		
		/*
		 * Negative, positive, zero
		 */
		
		// create a scanner object
		Scanner scannerInput = new Scanner(System.in);
		
		// get user input 
		System.out.println("pls enter the 1st of 5 numbers, and hit enter after each number");
		System.out.print("1st number pls: ");
		// add to a variable
		int num1 = scannerInput.nextInt();
		
		/*
		System.out.print("2nd number pls: ");
		// add to a variable
		int num2 = scannerInput.nextInt();
		
		System.out.print("3rd number pls: ");
		// add to a variable
		int num3 = scannerInput.nextInt();
		
		System.out.print("4th number pls: ");
		// add to a variable
		int num4 = scannerInput.nextInt();
		
		System.out.print("5th number pls: ");
		// add to a variable
		int num5 = scannerInput.nextInt();
		*/
		
		System.out.println(num1); // + num2 + num3 + num4 + num5);
		
		if ( num1 < 0 ) // || num2 <= 0 || num3 <= 0 || num4 <= 0 || num5 <= 0 )
		{
			System.out.println("negative");
		}
		if ( num1 == 0 ) // || num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0 )
		{
			System.out.println("zero");
		}
		if ( num1 >= 1 ) // || num2 >= 1 || num3 >= 1 || num4 >= 1|| num5 >= 1 )
		{
			System.out.println("positive");
		}
		
		
		// Exercise 2.31
		
		/*
		 * Table of squares and cubes
		 */
		
		/* // ----------comments on 2.31--------------
		int n = 0;

		System.out.println("number" + "\t" + "square" + "\t" + "cube");
		System.out.println(n + "\t" + (n * n) + "\t" + (n * n * n));
		n++;
		System.out.println(n + "\t" + (n * n) + "\t" + (n * n * n));
		n++;
		System.out.println(n + "\t" + (n * n) + "\t" + (n * n * n));
		n++;
		System.out.println(n + "\t" + (n * n) + "\t" + (n * n * n));
		n++;
		System.out.println(n + "\t" + (n * n) + "\t" + (n * n * n));
		n++;
		System.out.println(n + "\t" + (n * n) + "\t" + (n * n * n));
		n++;
		System.out.println(n + "\t" + (n * n) + "\t" + (n * n * n));
		n++;
		System.out.println(n + "\t" + (n * n) + "\t" + (n * n * n));
		n++;
		System.out.println(n + "\t" + (n * n) + "\t" + (n * n * n));
		n++;
		System.out.println(n + "\t" + (n * n) + "\t" + (n * n * n));
		n++;
		System.out.println(n + "\t" + (n * n) + "\t" + (n * n * n));
		n++;
		*/ // ---------end comments for 2.31---------------

		
		/* // -------Ex 2.31 with for loop, but not what we have learnt yet-------
		int number;
		int square;
		int cube;
		int i;
		
		System.out.println("number" + "\t" + "square" + "\t" + "cube");
		
		for (i = 0; i <= 10; i++)
		{
			number = i;
			square = number * number;
			cube = number * number * number;
			System.out.println(number + "\t" + square + "\t" + cube);
		}
		*/ //--------end of comment 2.31----------
		
		// Exercise 2.30
		
		/*
		 * Separating digits
		 */
		
		/* //--------comment for 2.30-----------
		// create a scanner for user input
		Scanner scannerInput = new Scanner(System.in);
		
		// get user input
		System.out.print("Please enter a long number: ");
		
		// assign input to variable & create other variables
		int number = scannerInput.nextInt();
		int output;
		int i;
		
		for (i=1000000000; i >= 1; i = i / 10 )
		{
			output = number / i;
			if ( output != 0 )
			{
				number = number - (output * i);
				System.out.print(output + " ");
			}
		}
		*/ //--------end for comment 2.30-----------
		
		// Exercise 2.29
		
		/*
		 * Integer value of a character
		 * This one is really hard, I will get back to it
		 */
		
		/*
		String number = "65";
		int result = Integer.parseInt(number);
		System.out.println(result);
		*/
		//String letter = "A";
		//String letter = ((int) 'A');
		//System.out.printf("%c%n%s%n", 'A', ((int) 'A'));
		//System.out.println(letter);
		
		// System.out.printf("The char %c has the value %d%n", 'b', ((int) 'b'));

		
		// System.out.printf("%s%n", convertString, ((int) convertString));
		// System.out.printf("%nThe char %c has the value %d%n", 'A', ((int) 'A'));
		
		//System.out.printf("%nThe char %c has the value %d%n", 'b', ((int) 'b'));
		// ------------end exercise 2.29----------------
		
		// Exercise 2.28
		
		/*
		 * Diameter, circumference, and area of a circle
		 */
		
		/* //-------comment on 2.28-------------
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
		System.out.println("Diameter is 2x radius: " + (2 * radius));
		System.out.println("Circumference is 2 x radius x PI: " + (2 * pi * radius));
		System.out.println("Area is PI x Radius(sqr): " + ((radius * radius) * pi));
		 */ //---------end comment 2.28------------
		
		
		// Exercise 2.27
		
		/*
		 * Write a program that creates a checkerboard
		 */
		
		/*// Solution 1, using only what we have learnt in the book
		
		String checker = "* * * * * * *";
		String checkerOff = " * * * * * * *";
		
		System.out.println(checker);
		System.out.println(checkerOff);
		System.out.println(checker);
		System.out.println(checkerOff);		
		System.out.println(checker);
		System.out.println(checkerOff);
		*/
		
		/* // Solution 2; using a for loop
		
		int i,k;
		
		for (i = 1; i < 10; i++)
		{
			if ( i % 2 == 0)
			{
				System.out.print("* ");
				for (k = 1; k < 10; k++)
				{
					System.out.print("* ");
				}
			}
			if ( i % 2 == 1)
			{
				System.out.print(" *");
				for (k = 1; k < 10; k++)
				{
					System.out.print(" *");
				}
			}

			System.out.println();
		}
		*/ // ------end comments 2.27-------
		
		// Exercise 2.26
		
		/*
		 * Multiples
		 */
		
		/* //------------comment exercise 2.26-----------
		// create a scanner object
		Scanner scannerInput = new Scanner(System.in);
		
		// get two numbers from user
		System.out.print("pls enter a number: ");
		// pass input to 1st variable
		int num1 = scannerInput.nextInt();
		System.out.print("pls enter another number: ");
		// pass input to 2nd variable
		int num2 = scannerInput.nextInt();
		
		//System.out.println(num1 + " " + num2);
		
		System.out.println("Calculating whether these are multiple variables ");
		
		int resultMain = num1 / num2;
		int resultOver = num1 % num2;
		String multiples = "";
		
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
		
		*/ //-----end of comment 2.26---------
		
		
		// Exercise 2.25
		
		/*
		 * Odd even app
		 */
		
		/*// ----Comment 2.25-------
		int usrInput; 	// user input
		int divResult;	// remainder after %2
		String message = "";	// Odd or even message
		
		// Create scanner object
		Scanner scannerInput = new Scanner(System.in);
		
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
			
		*/ // ------end comment 2.25-----
		    
		// Exercise 2.24
		
		/*
		 * write app to read, print and find largest, smallest of 5 digits
		 */
		
		/*//--------comment 2.24----------
		// create scanner object
		Scanner scannerInput = new Scanner(System.in);
		
		// Get user input
		System.out.print("pls enter 1st digit: ");
		// store user i/p as a variable
		int ip1 = scannerInput.nextInt();
		
		System.out.print("pls enter 2nd digit: ");
		// store user i/p as a variable
		int ip2 = scannerInput.nextInt();
		
		System.out.print("pls enter 3rd digit: ");
		// store user i/p as a variable
		int ip3 = scannerInput.nextInt();
		
		System.out.print("pls enter 4th digit: ");
		// store user i/p as a variable
		int ip4 = scannerInput.nextInt();
		
		System.out.print("pls enter 5th digit: ");
		// store user i/p as a variable
		int ip5 = scannerInput.nextInt();
		
		// create variables for largest/smallest numbers
		int largest = 0;
		int smallest = 0;
		
		// test for largest number
		if ( (ip1 > ip2) && (ip1 > ip3) && (ip1 > ip4) && (ip1 > ip5))
		{
			largest = ip1;
		}
		if ( (ip2 > ip1) && (ip2 > ip3) && (ip2 > ip4) && (ip2 > ip5))
		{
			largest = ip2;
		}
		if ( (ip3 > ip1) && (ip3 > ip2) && (ip3 > ip4) && (ip3 > ip5))
		{
			largest = ip3;
		}
		if ( (ip4 > ip1) && (ip4 > ip2) && (ip4 > ip3) && (ip4 > ip5))
		{
			largest = ip4;
		}
		if ( (ip5 > ip1) && (ip5 > ip2) && (ip5 > ip3) && (ip5 > ip4))
		{
			largest = ip5;
		}
		
		System.out.println("Largest number is: " + largest);
		
		// test for smallest number
		if ( (ip1 < ip2) && (ip1 < ip3) && (ip1 < ip4) && (ip1 < ip5))
		{
			smallest = ip1;
		}
		if ( (ip2 < ip1) && (ip2 < ip3) && (ip2 < ip4) && (ip2 < ip5))
		{
			smallest = ip2;
		}
		if ( (ip3 < ip1) && (ip3 < ip2) && (ip3 < ip4) && (ip3 < ip5))
		{
			smallest = ip3;
		}
		if ( (ip4 < ip1) && (ip4 < ip2) && (ip4 < ip3) && (ip4 < ip5))
		{
			smallest = ip4;
		}
		if ( (ip5 < ip1) && (ip5 < ip2) && (ip5 < ip3) && (ip5 < ip4))
		{
			smallest = ip5;
		}
		
		System.out.println("Smallest number is: " + smallest);
		
		*/ // --------end comment 2.24----------
		
		
		// Exercise 2.23
		
		/* // -------comment 2.23
		System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");
		*/ // ---------end comment 2.23
		
		
		
		
		
		// Exercise 2.21
		
		/*//---------comment 2.21--------
		System.out.print("*");
		System.out.print("***");
		System.out.print("*****");
		System.out.print("***");
		System.out.println("**");
		*/ // --------end comment 2.21----------
		
		
		
		
		
		// Exercise 2.20
		
		/*//-------Comment 2.20-------
		System.out.println("*");
		System.out.println("***");
		System.out.println("*****");
		System.out.println("***");
		System.out.println("*");
		*/ // --------end comment 2.20---------
		
		// Exercise 2.19
		
		/*//---------comment 2.19-------
		System.out.printf("*%n**%n***%n****%n*****%n");
		*/ // ---------end of 2.19--------
		
		//Exercise 2.18

		/*
		 * Display Shapes with *
		 */
		/*//--------2.18 comments-------
		System.out.println("*********" + "\t" + "  ***  " + "\t" + "  *  ");
		System.out.println("*       *" + "\t" + " *   * " + "\t" + " *** ");
		System.out.println("*       *" + "\t" + "*     *" + "\t" + "*****");
		System.out.println("*       *" + "\t" + "*     *" + "\t" + "  *  ");
		System.out.println("*       *" + "\t" + "*     *" + "\t" + "  *  ");
		System.out.println("*       *" + "\t" + "*     *" + "\t" + "  *  ");
		System.out.println("*       *" + "\t" + "*     *" + "\t" + "  *  ");
		System.out.println("*       *" + "\t" + " *   * " + "\t" + "  *  ");
		System.out.println("*********" + "\t" + "  ***  " + "\t" + "  *  ");
		*/ //--------end of 2.18--------
		
		/*//---------comment 2.19-------
		System.out.printf("*%n**%n***%n****%n*****%n");
		*/ // ---------end of 2.19--------
		
		
		
		// Exercise 2.17
		
		/*
		 * Arithmetic, smallest/largest. Write an app that inputs 3 integers from
		 * the user and displays the sum, average, product, smallest, largest.
		 */
		
		/* //----- comments for exercise 2.17------
		// set up variables
		int num1;
		int num2;
		int num3;
		int sum;
		int average;
		int product;
		int smallest = 0;
		int largest = 0;
		
		// set up scanner object
		Scanner input = new Scanner(System.in);
		
		// ask user for input 1.
		System.out.print("pls enter an integer: ");
		// store integer in variable
		num1 = input.nextInt();
		
		// ask user for input 2.
		System.out.print("pls enter a 2nd integer: ");
		// store integer in variable
		num2 = input.nextInt();
		
		// ask user for input 3.
		System.out.print("pls enter a 3rd integer: ");
		// store integer in variable
		num3 = input.nextInt();
		
		// debug line to check input
		// System.out.printf("%d %d %d", num1, num2, num3);
		
		// calculation section
		
		sum = num1 + num2 + num3;
		average = (num1 + num2 + num3) / 3;
		product = num1 * num2 * num3;
		
		// display output
		System.out.printf(" sum = %d%n average = %d%n product = %d%n", sum, average, product);
		
		// find largest number
		if ( num1 > num2 && num1 > num3 )
		{
			largest = num1;
		}
		if ( num2 > num1 && num2 > num3)
		{
			largest = num2;
		}
		if ( num3 > num1 && num3 > num2)
		{
			largest = num3;
		}
		
		System.out.println("Largest number is: " + largest);
		
		// find smallest number
		if ( num1 < num2 && num1 < num3 )
		{
			smallest = num1;
		}
		if ( num2 < num1 && num2 < num3)
		{
			smallest = num2;
		}
		if ( num3 < num1 && num3 < num2)
		{
			smallest = num3;
		}
		
		System.out.println("Smallest number is: " + smallest);
		*/ //-----End comments for exercise 2.17------
		
		// Exercise 2.16
		
		/*
		 * Comparing Integers: Write an application that asks the user
		 * to enter two integers, obtains them from the user and displays 
		 * the larger number followed by "is larger"
		 * 
		 */
		
		/* //----- comments for exercise 2.16------
		// create a scanner object
		Scanner scannerName = new Scanner(System.in);
		
		// Ask user for input
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
		
		*/ //-----End comments for exercise 2.16------
		
		
		// Exercise 2.15
		
		/*
		 * Write an app that asks a user to enter 2 integers, obtains them from the 
		 * user, prints their sum, product, difference, quotent(division)
		 */
		
		/* -----Comments for exercise 2.15------
		// Create scanner object
		Scanner scannerName = new Scanner(System.in);
		
		// prompt user for input
		System.out.print("pls enter an integer: ");
		
		// store input to variable
		int firstInput = scannerName.nextInt();
		
		// prompt user for second input
		System.out.print("pls enter another integer: ");
		
		// store input to variable
		int secondInput = scannerName.nextInt();
		
		// -----calculation section-------
		
		// calculate sum
		int addition = firstInput + secondInput;
		
		// calculate product
		int product = firstInput * secondInput;
		
		// calculate difference
		int difference = firstInput - secondInput;
		
		// calculate quotent
		int quotent = firstInput / secondInput;
		
		// -----display results section-------
		
		System.out.println("Using the two numbers provided: ");
		System.out.println("The sum is; \t\t" + addition);
		System.out.println("The product is; \t" + product);		
		System.out.println("The difference is; \t" + difference);
		System.out.println("The quotent is; \t" + quotent);
		
		// Closes scanner
		if(scannerName != null) {
		    scannerName.close();
		
		*/ //-----End comments for exercise 2.15------
		
		// Exercise 2.10
		/*
		 * What do the following printf() statements print
		 */
		
		/*  -----Comments for exercise 2.10------
		int x = 2;
		int y = 3;
		
		// 2.10 a)
		System.out.printf("x = %d%n", x);
		// 2.10 b)
		System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
		// 2.10 c)
		System.out.printf("x = ");
		// 2.10 d)
		System.out.printf("%d = %d%n", (x + y), (y + x));
		
		System.out.printf("%d%n", x = 2 % 2 + 2 * 2 - 2 / 2);
		
		System.out.printf("%d%n", x = (3 * 9 * (3 + (9 * 3 / (3)))));
		
		System.out.println("1 2 3 4");
		
		System.out.print("1 ");
		System.out.print("2 ");
		System.out.print("3 ");
		System.out.print("4 ");
		
		System.out.printf("%n");
		System.out.printf("%d %d %d %d", 1, 2, 3, 4);
		*/ //-----End comments for exercise 2.10------
		
		
		
		// Exercise 2.5
		/* 
		 * Program to calculate product of 3 integers
		 */
		
		/* -----Comments for exercise 2.5------
		// Create a scanner object to take input
		Scanner input = new Scanner(System.in);
		
		// declaration of 3x variables
		int x;
		int y;
		int z;
		int result;
		
		// get user input for first integer
		System.out.print("Enter 1st integer: ");
		
		// get input and assign it to first variable
		x = input.nextInt();
		
		// get user input for first integer
		System.out.print("Enter 2nd integer: ");
		
		// get input and assign it to second variable
		y = input.nextInt();
		
		// get user input for third integer
		System.out.print("Enter 3rd integer: ");
		
		// get input and assign it to third variable
		z = input.nextInt();
		
		// Validate input
		System.out.println("You entered: " + x);
		System.out.println("You entered: " + y);
		System.out.println("You entered: " + z);
		
		// compute product of 3 variables
		result = x * y * z;
		
		System.out.printf("%s%n%s%n", "The product is: ", result);
		
				// Closes scanner
		if(input != null) {
		    input.close();
		
		// -----End comments for exercise 2.5------
		*/

		// Exercise 2.3
		/* 
		 * Do the following tasks
		 */
		
		/* -----Comments for exercise 2.3------
		// Create a scanner object to take input called scannerName
		Scanner scannerName = new Scanner(System.in);
		
		// a) declare variables
		int c;
		int thisIsAVariable;
		int q76354;
		int number;
		
		// b) prompt user to enter an Integer
		System.out.print("Please enter an integer: ");
		// Takes input and assigns it to a variable
		int value = scannerName.nextInt();
		// Display input
		System.out.println("you entered: " + value);
		
		// Print line with printf
		System.out.printf("%s", "This is a Java program");
		
		// Print line with printf
		System.out.printf("%n%s%n%s%n", "This is a Java", "program");
		
		if ( value == 7 )
		{
			System.out.println("Number entered is SEVEN");
		}
		
				// Closes scanner
		if(scannerName != null) {
		    scannerName.close();
		
		// -----End comments for exercise 2.3------
		*/
		

		
	}
	
}


