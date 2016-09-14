public class Chap02ex29

/*
 * Michael Floerchinger
 * 
 * Exercise 2.29
 * Integer value of a character
 * 
 * !!!!!!!!INCOMPLETE!!!!!!!!!
 * 
 */

{
	public static void main(String[] args)
	{
		// usage information
		System.out.println("Returns an integer value for a character");
		
		// given example
		System.out.printf("%nThe char %c has the value %d%n", 'A', ((int) 'A'));
		
		// my experiment #1
		/*
		String inPut = "A";
		System.out.printf("%nThe char %c has the value %d%n", inPut, ((int) inPut));
		*/ 
		
		// experiment #2
		// attempted to cast, string number no problems 
		/*
		String number = "65";
		int result = Integer.parseInt(number);
		System.out.println(result);
		*/
		
		// experiment #3
		// attempted to cast, string character = NumberFormatException
		String number = "A";
		int result = Integer.parseInt(number);
		System.out.println(result);
		
		
		//String letter = "A";
		//String letter = ((int) 'A');
		//System.out.printf("%c%n%s%n", 'A', ((int) 'A'));
		//System.out.println(letter);
		
		// System.out.printf("The char %c has the value %d%n", 'b', ((int) 'b'));

		
		// System.out.printf("%s%n", convertString, ((int) convertString));
		// System.out.printf("%nThe char %c has the value %d%n", 'A', ((int) 'A'));
		
		//
		//
		
		
		
		
		
		
	}
}