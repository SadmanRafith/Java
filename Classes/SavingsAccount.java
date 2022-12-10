
package Classes;
import java.lang.*;

public class SavingsAccount extends Account
{
	private double interestRate;
	
	public void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
	public double getInterestRate()
	{
		return interestRate;
	}
	public void showDetails()
	{
		//super.showDetails();
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: "+balance);
		System.out.println("Interest Rate: "+interestRate);
	}
}