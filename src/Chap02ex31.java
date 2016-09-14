public class Chap02ex31

/*
 * Michael Floerchinger
 * 
 * Exercise 2.31
 * 
 * Table of Squares and Cubes
 */
{
	public static void main(String[] args)
	{
		
		// -------------Solution 1: Using only what we have learnt so far-----
		System.out.println("\n\nSolution 1: Using only what we have learnt so far\n");
		
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
		
		// -------------Solution 2: Not yet what we learnt from the book-----
		
		System.out.println("\n\nSolution 2: Not yet what we learnt from the book\n");
		
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
		
	}
}
	