import java.lang.*;
public class Account
{
	private int accNo;
	private double balance;
	public Account(int accNo, double balance)
	{
		System.out.println("Param-Account");
		this.accNo = accNo;
		this.balance = balance;
	}
	public void display()
	{
		System.out.println("ACC NO: "+accNo);
		System.out.println("Balance: "+balance);
	}
}