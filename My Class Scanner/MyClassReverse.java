import java.lang.*;
import java.util.Scanner;


class MyClassReverse{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter name, age and salary: ");

		//String Input
		//String name = myObj.nextLine();

		//Numerical Imput
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();

		//String Input
		String name = myObj.nextLine();

		//Output input by user
		System.out.println("Name   : "+name);
		System.out.println("Age    : "+age);
		System.out.println("Salary : "+salary);
	}	
}