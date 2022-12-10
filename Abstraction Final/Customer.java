import java.lang.*;

public class Customer
{
	private String phnNumber;
	Account accounts[] = new Account[10];
	
	public Customer(){}
	public Customer(String phnNumber)
	{
		this.phnNumber = phnNumber;
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
		System.out.println("Phn Number: "+phnNumber);
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




