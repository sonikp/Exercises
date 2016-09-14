public class _0311AccountTest
{
	public static void main(String[] args)
	{
		System.out.println("Account program: SET/GET name & balance");
		System.out.println("---------------------------------------");
		
		Account account = new _0311Account("tits mcgee", 14.51);
		
		System.out.println("Get current account name:\t" + account.getName());
		
	}
}