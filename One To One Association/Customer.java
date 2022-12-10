import java.lang.*;

public class Customer{

	private int c_id;
	private Account acc;            //--------- Account's object reference is acc

	
	public Customer(int c_id, 
				    Account acc){

		this.c_id = c_id;
		this.acc = acc;
	}
	
	//--------------------------------------------Customer's Deposit
	public void performDeposit(double amount){
		acc.deposit(amount);
	}

	//--------------------------------------------Customer's Display
	public void performDisplay(){
		System.out.println("C_ID: "+c_id);
		acc.display();
	}
}