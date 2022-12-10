import java.lang.*;
public class Start
{
	public static void main(String [] args)
	{
		Account a1 = new Account(123, 500);
		Customer c1 = new Customer("John", 111, a1);
		c1.display();
	}
}