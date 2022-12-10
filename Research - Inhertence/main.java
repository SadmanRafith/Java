import java.lang.*;

public class main{
	public static void main(String[] args){
		A a1 = new A();
		B b1 = new B();

		System.out.println("---------------------------------------------");
		System.out.println("---------Output Tracing----------------------\n");
		a1.callA();
		b1.callB();

		//a1.callB();
		//b1.callA();

		// simillarly a1.setRoll(75);


		/*
		Here if we write b1.callA() and a1.callB() instead of the method, we will
		not be able to call it. cause varaiable a1 is type of A and the function is
		callB. Hence, it cannot be called!
		*/
	}
}