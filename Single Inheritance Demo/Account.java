import java.lang.*;

public class Account
{
	private int id;
	private double balance;
	
	public Account(int id, double balance)
	{
		System.out.println("Parameterized Constructor - Account");
		this.id=id;
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	public void sendmoney(Account a, double amount)
	{
		this.balance = this.balance-amount;
		a.balance = a.balance+amount;
	}
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Balance: "+balance);
	}
}