import java.lang.*;
public class Customer extends Person
{
	private int c_id;
	private Account acc;
	public Customer(String name, int c_id, Account acc)
	{
		super(name);
		System.out.println("Param-Customer");
		this.c_id = c_id;
		this.acc = acc;
	}
	public void display()
	{
		super.display();
		System.out.println("C_ID:"+c_id);
		acc.display();
	}
	
}