import java.lang.*;

public class A{

	//private int a=4;
	//private int b=2;
	public static int s=5;        //The initial value of s


	/*
	In Java, non-static final variables can be assigned a value either in constructor 
	or with the declaration. But, static final variables cannot be assigned value in 
	constructor; they must be assigned a value with their declaration.
	*/

	static void setS(int here){
		s=here;
	}

	/*
	this. (non static) operator cannot be used to initialize static variables
	*/

	static int getS(){
		return s;
	}
	static void DisplayS(){
		System.out.println("Hey! Displaying the static method");
	}

	public static void main(String[] args){

		//System.out.println("a : "+a);
		//System.out.println("b : "+b);
		System.out.println("\n-----------------------------------");
		System.out.println("Initial value of s : "+s);

		A a1 = new A();
		A a2 = new A();

		a1.setS(1);
		a2.setS(11);

		/*
		The changes made in a1 will also affect a2 and the whole class
		*/

		/*
		a1.setS(1) can also be written as A.setS(1); Either way is appropiate
		*/

		System.out.println("\n-----------------------------------");
		System.out.println("Getting the value of s : "+a1.getS());
		System.out.println("Getting the value of s : "+a2.getS());
		System.out.println("Getting the value of s : "+A.getS());
		

		System.out.println("\n-----------------------------------");
		a1.DisplayS();	//object.method
		A.DisplayS();   //class.method

		System.out.println("\n-----------------------------------");
		System.out.println("After setting the value of s : "+s);
	}
}