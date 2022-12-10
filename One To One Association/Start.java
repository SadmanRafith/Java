import java.lang.*;

public class Start{

	public static void main(String[] args){

		Account a1 = new Account(123, 1500.0);
		Customer c1 = new Customer(111, a1);

		c1.performDeposit(300.0);
		c1.performDisplay();
		
	}
}