import java.lang.*;

public class B extends A{
	private int roll;

	public void callB(){
		System.out.println("\nCalling B");
	}

	public void setRoll(int roll){
		this.roll=roll;
	}
}