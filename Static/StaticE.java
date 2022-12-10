import java.lang.*;
public class StaticE
{
	public int a;
	public static int b = 85;

	static
	{
		System.out.println("Static block 3");
		b = 75;
	}
	public StaticE()
	{
		System.out.println("Empty constructor");
	}


	public void Display(){
		System.out.println("Display method");
	}
	static
	{
		System.out.println("Static block 1");
		b = 75;
	}
	static
	{
		System.out.println("Static block 2");
	}
	public static void main(String[] args)
	{
		StaticE s1 = new StaticE();
		StaticE s2 = new StaticE();
		s1.a = 10;
		s2.a = 20;

		s1.Display();
		
		System.out.println("S1.a: "+s1.a);
		System.out.println("S2.a: "+s2.a);
		System.out.println("S1.b: "+s1.b);
		System.out.println("S2.b: "+s2.b);
		StaticE s3 = new StaticE();
		System.out.println("S3.a: "+s3.a);
		System.out.println("S3.b: "+s3.b);
	}
}