import java.lang.*;
public class Start
{
	public static void main(String[] args)
	{
		Account a1 = new Account(123, 1500);
		Account a2 = new Account(234, 2500);
		Account a3 = new Account(345, 3500);
		
		Customer c1 = new Customer(111, 3);
		c1.insertAccount(a1);
		c1.insertAccount(a2);
		c1.insertAccount(a3);
		
		
		c1.removeAccount(a2);
		c1.displayAccount();
		
	}
}