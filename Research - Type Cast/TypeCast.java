import java.lang.*;

public class TypeCast{

	//class attributes and initialization
	private int i1=25,
				i3;
	private float f1,
				  f3=45.56F;            //F is needed initializing a float number

	public static void main(String[] args) {

		//main function attributes and initialization
		int i2=35;
		float f2;

		TypeCast tc = new TypeCast();

		//type casting class variables
		tc.f1=tc.i1;
		tc.i3=(int)tc.f3;

		//type casting main variables
		f2=i2;

		//printing a value of a variable of class
		System.out.println("Class Variables Output");
		System.out.println("Value from class variable : "+tc.f1);
		System.out.println("Value from class variable : "+tc.i3);


		//printing a value of a variable of the main function
		System.out.println("Value from main variable : "+f2);
	}
}