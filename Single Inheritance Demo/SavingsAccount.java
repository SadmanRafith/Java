import java.lang.*;

public class SavingsAccount extends Account
{
	private double limit;
	
	public SavingsAccount(int id, double balance, double limit)
	{
		super(id, balance);
		this.limit = limit;
		System.out.println("Parameterized Constructor-SavingsAccount");
	}
	public void display()
	{
		super.display();
		System.out.println("Limit: "+limit);
	}
	
}