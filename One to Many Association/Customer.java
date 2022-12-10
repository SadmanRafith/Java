import java.lang.*;
public class Customer
{
	private int cusID;
	private Account accounts[];
	public Customer(int cusID, int count)
	{
		this.cusID = cusID;
		accounts = new Account[count];
	}
	public void insertAccount(Account acc)
	{
		int flag = 0;
		for(int i = 0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = acc;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Inserted!");}
		else{System.out.println("Intersion Failed!");}
	}	
	public void removeAccount(Account acc)
	{
		int flag = 0;
		for(int i = 0; i<accounts.length; i++)
		{
			if(accounts[i] == acc)
			{
				accounts[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Removed!");}
		else{System.out.println("Removal Failed!");}
	}	
	public void displayAccount()
	{
		
		for(int i = 0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				System.out.println("Customer ID: "+cusID);
				accounts[i].display();
			}
			else{System.out.println("Object not available!");}
		}
		
		
	}	
}