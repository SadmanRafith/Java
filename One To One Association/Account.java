import java.lang.*;

public class Account{

	//-----------------------------------Attributes
	private int a_id;
	private double balance;

	public Account(int a_id, 
				   double balance){

		this.a_id = a_id;
		this.balance = balance;
	}

	//--------------------------------------Account's deposit
	public void deposit(double amount){
		if(amount>0){
			balance = balance+amount;
		}
		else{
			System.out.println("Invalid amount!");
		}
	}

	//-------------------------------------account details
	public void display()
	{
		System.out.println("AID: "+a_id);
		System.out.println("Balance: "+balance);
	}
}