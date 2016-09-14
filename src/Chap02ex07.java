public class Chap02ex07




{
	public static void main(String[] args)
	{
		System.out.println("Chap02ex07");
		
		/*
		 * Michael Floerchinger
		 * 
		 * ------------Exercise 2.7---------------
		 * 
		 * a. Comments // /* (+endig marker) and /** (+endig marker) (Javadocs)
		 * b. if statement
		 * c. arithmetic 
		 * d. division and remainder (%)
		 * e. innermost
		 * f. variable
		 * 
		 * ------------Exercise 2.8--------------
		 * 
		 * 
		 */
		
		// a) Display the message "Enter an integer"
		
		System.out.print("--Exercise 2.8----\n");
		System.out.print("Enter an integer:");
		System.out.print("\n--------\n");
		
		// b) // NB, I had to initialize these variables because I was getting errors later in this file
		int a = 0;
		int b = 0;
		int c = 0;
		a = b * c;
		
		// c) This program performs a sample payroll calculation
		
		/*
		 * --------End of Exercise 2.8-----------
		 */
		
		/*
		 * ------------Exercise 2.9--------------
		 * 
		 * a) False, depending on the precedence of the operators, /%* vs +- the 
		 * highest order operators are always evaluated first from left to right, 
		 * then the lower order operators. Once calculation is complete, the 
		 * output is read right to left and result placed on RH side of = sign
		 * 
		 * b)true
		 * 
		 * c) False, depends on the operators within the expression
		 * 
		 * d) False: h2 is valid, it does not begin with a number
		 * 
		 * 
		 */
		
		/*
		 * ------------Exercise 2.10--------------
		 * 
		 * 
		 * a) x = 3 CRLF	; curser is on a new line
		 * 
		 * b) Value of 3 + 3 = 6 CRLF	; first %d is first value after, second and so on
		 * 
		 * c) x = 	; curser stays on same line
		 * 
		 * d) 5 = 5 CRLF	; sum of x+y first variable, & y+x second variable
		 * 
		 * 
		 */
		
		/*
		 * ------------Exercise 2.11--------------
		 * 
		 * 
		 * a) yes, p now equals i + j + k + 7
		 * 
		 * b) no, this is a statement
		 * 
		 * c) no, this is a statement
		 * 
		 * d) yes, value now = an input integer
		 * 
		 * 
		 */
		
		
		/*
		 * ------------Exercise 2.12--------------
		 * 
		 * e) y = a * (x * x * x) + 7
		 *  
		 */
		
		/*
		 *  ------------Exercise 2.13--------------
		 *  
		 * a) 3 * 6, then / 2, then + 7, then - 1
		 * 
		 * b) remainder of 2 % 2, then 2 * 2, then 2 / 2, then addition of
		 * first result 0, + 4 (result of second), - 1 (result of 3rd) = 3
		 * 
		 * c) 3 in the innermost bracket is evaluated first, then 9 * 3 / 3, then + 3, 
		 * from the next outer bracket(12), then left to right 3 * 9  * 12 (result from brackets)
		 *  
		 */
		
		/*
		 * ------------Exercise 2.14--------------
		 * 
		 * 
		 * 
		 */
		
		System.out.println("----Exercise 2.14-----");
		
		// a)
		
		System.out.println("1 2 3 4");
		
		// b)
		
		System.out.print("1 ");
		System.out.print("2 ");
		System.out.print("3 ");
		System.out.print("4 ");
		
		// c) New line %n added for readability
		
		System.out.printf("%n%d %d %d %d%n", 1, 2, 3, 4);
		
		
		
		
		
		
		
		
	}
}