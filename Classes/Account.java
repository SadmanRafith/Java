package Classes;
import java.lang.*;

public abstract class Account
{
	protected int accountNumber;
	protected String accountHolderName;
	protected double balance;

	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public int getAccountNumber(){return accountNumber;}
	public String getAccountHolderName(){return accountHolderName;}
	public double getBalance(){return balance;}
	
	public void deposit(double amount)
	{
		if(amount>0){balance+=amount;}
		else{System.out.println("Can Not Deposit");}
	}
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=balance){balance-=amount;}
		else{System.out.println("Can Not Withdraw");}
	}
	
	public abstract void showDetails(); //remove the abstract keyword and the ; if you uncomment the following code
	/*{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: "+balance);
	}*/
	
}