import java.lang.*;
public class Account
{
	private int ano;
	private double balance;
	public Account()
	{
		System.out.println("Empty constructor");
	}
	public Account(int ano, double balance)
	{
		System.out.println("Parameterized constructor");
		this.ano=ano;
		this.balance=balance;
	}
	public void setAno(int ano)
	{
		this.ano=ano;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public int getAno()
	{
		return ano;
	}
	public double getBalance()
	{
		return balance;
	}
	public void withdraw(double amount)
	{
		if(balance>=amount && amount>0)
		{
			balance = balance - amount;
			System.out.println("Withdrawal successful");
		}
		else
		{
			System.out.println("Withdrawal unsuccessful");
		}
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance = balance + amount;
			System.out.println("Deposit successful");
		}
		else
		{
			System.out.println("Invalid amount. Deposit unsuccessful");

		}
	}
	public void showDetails()
	{
		System.out.println("Account number: "+ano);
		System.out.println("Blance: "+balance);
	}
}
