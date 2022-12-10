import java.lang.*;
public class Account
{
	private int accNo;
	private double balance;
	public Account(int accNo, double balance)
	{
		this.accNo = accNo;
		this.balance = balance;
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance = balance+amount;
		}
		else
		{
			System.out.println("Invalid amount!");
		}
	}
	public void display()
	{
		System.out.println("Account Number: "+accNo);
		System.out.println("Account Balance: "+balance);
	}
}