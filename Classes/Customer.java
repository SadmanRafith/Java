package Classes;
import java.lang.*;
import Interfaces.*;

public class Customer implements IAccountOperations
{
	Account accounts[] /*= new Account [10]*/;
	
	public Customer(){}
	//you may comment the whole parameterized constructor if you uncomment the comment in line 5
	public Customer(int sizeOfArray)
	{
		accounts = new Account[sizeOfArray];
	}
	
	public void addAccount(Account a)
	{
		int flag = 0;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Inserted");}
		else {System.out.println("Can Not Insert");}
	}
	
	public void removeAccount(Account a)
	{
		int flag =0;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag==1){System.out.println("-----Removed-----");}
		else{System.out.println("-----CanNot Remove-----");}
	}
	
	public void showAllAccounts()
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				System.out.println("-----------------------");
				accounts[i].showDetails();
				System.out.println();
			}
		}
	}
	public Account getAccount(int accountNumber)
	{
		Account a = null;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				if(accounts[i].getAccountNumber() == accountNumber)
				{
					a=accounts[i];
					break;
				}
			}
		}
		return a;
	}
}