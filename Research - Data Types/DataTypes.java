import java.lang.*;
//primitive data types
//---------------------------

public class DataTypes{

	//attributes
	private boolean bool;
	private byte by1, by2, by;
	private short sh;
	private int i;
	private char ch='\uFFFF';
	private long lo;
	private float f;
	private double d;


	public static void main(String[] args) {
		
		DataTypes dt = new DataTypes();

		System.out.println("---------------------------");
		System.out.println("---------Primitive---------\n\n");


		//Boolean type
		System.out.println("Boolean value 		: "+dt.bool);
		//Byte type
		dt.by1 = -128;
		dt.by2 = 127;

		//dt.by1 = -129 will give error
		//dt.by2 = 128 will give error
		//beacause these are not within limit

		System.out.println("Byte type 1 		: "+dt.by1);
		System.out.println("Byte type 2		: "+dt.by2);
		System.out.println("Byte type 		: "+dt.by);

		//All deafault values below
		//Short type
		System.out.println("Short type 		: "+dt.sh);
		//Integer type
		System.out.println("Integer type 		: "+dt.i);
		//Character type (null)
		System.out.println("Character type		: "+dt.ch);
		//Long type
		System.out.println("Long type 		: "+dt.lo);
		//Float type
		System.out.println("Float type 		: "+dt.f);
		//Double type
		System.out.println("Double type 		: "+dt.d);
	}
}