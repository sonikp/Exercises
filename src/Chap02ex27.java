public class Chap02ex27

/*
 * Michael Floerchinger
 * 
 * Exercise 2.27
 * Checkerboard of Asterix (*) Not the Belgium cartoon hero! :)
 */
{
	public static void main(String[] args)
	{
		// Solution 1, using only what we have learnt in the book
		
		String checker = "* * * * * * *";
		String checkerOff = " * * * * * * *";
		
		System.out.println("Solution 1, using only what we have learnt so far in the book\n\n\n");
		
		System.out.println(checker);
		System.out.println(checkerOff);
		System.out.println(checker);
		System.out.println(checkerOff);		
		System.out.println(checker);
		System.out.println(checkerOff);
		
		
		// Solution 2; using a for loop
		System.out.println("\n\n\n\nSolution 2; using a for loop\n\n\n\n");
		
		
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
	}
}