import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		SavingsAccount sa1 = new SavingsAccount(123, 700, 1000);
		sa1.display();
		sa1.deposit(500);
		System.out.println("SA1.BALANCE: "+sa1.getBalance());
		sa1.withdraw(300);
		System.out.println("SA1.BALANCE: "+sa1.getBalance());
		SavingsAccount sa2 = new SavingsAccount(456, 800, 2000);
		sa2.sendmoney(sa1, 300);
		System.out.println("SA1.BALANCE: "+sa1.getBalance());
		System.out.println("SA2.BALANCE: "+sa2.getBalance());
		

	}
}