import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Account a1 = new Account();
		a1.setAno(111);
		a1.setBalance(500.0);
		
		System.out.println("Account number: "+a1.getAno());
		System.out.println("Balance: "+a1.getBalance());
		a1.deposit(-2000.0);
		System.out.println("Balance: "+a1.getBalance());
		a1.withdraw(700.0);
		System.out.println("Balance: "+a1.getBalance());
		
		Account a2 = new Account(222, 1000.0);
		a2.deposit(400);
		a2.withdraw(200);
		a2.showDetails();
	}
}