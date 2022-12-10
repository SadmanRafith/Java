import java.lang.*;
public class Person
{
	private String name;
	public Person(String name)
	{
		System.out.println("Param-Person");
		this.name = name;
	}	
	public void display()
	{
		System.out.println("Name:"+name);
	}
}