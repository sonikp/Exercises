/* Fig 3.8: Account.java
 * Account class with a double instance variable balance and a constructor 
 * and deposit method that performs validation
 * 
 */

public class _0311Account
{
	private String name;		// instance variable
	private double balance;		// instance variable
	
	// Constructor: receives two parameters
	public _0311Account(String name, double balance)
	{
		this.name = name;		// assign name to instance variable
		
		if (balance > 0.0)		// check that balance is not less than or == to zero
			this.balance = balance;	 // assign balance to instance variable
	}
	
	// method to set account name
	public void setName(String name)
	{
		this.name = name;
	}
	
	// method to get account name
	public String getName()
	{
		return name;
	}
	
}