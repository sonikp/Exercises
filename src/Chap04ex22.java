public class Chap04ex22
/*
 * Ex 4.22 Tabular output
 * 
 * pseudocode:
 * 
 * create a loop 1 - 5
 * multiply x * 10, x * 100, x * 1000
 */
{
	public static void main(String[] args)
	{
		int counter = 0;
		
		System.out.println("N\t" + "10*N\t" + "100*N\t" + "1000*N");
		
		for ( counter = 1; counter <= 5; counter++)
		{
			//System.out.println("counter : " + counter);
			System.out.println(counter + "\t"+ 10 * counter*10 + "\t" + counter * 100 + "\t" + counter * 1000);
		}
	}
}