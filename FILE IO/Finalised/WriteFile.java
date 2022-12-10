import java.io.*;

public class WriteFile
{
	public static void main(String []args)
	{
		try{
			FileWriter file = new FileWriter("C:\\Users\\Md. Mazid-Ul-Haque\\Desktop\\JAVA\\03 FILE IO\\Finalised\\Files\\New1.doc");   // write in the file according to where it is located
			file.write("This is a new file.\nSomething is being written....");
			  
			System.out.println("Written in the new file successfully");
			//System.out.println(getName());
			file.close();     //closed the file and all sorts of action io with the file is termininated
			//System.out.println("The file size is: "+file.length()+"Bytes"); 
		}

		catch(IOException io)
		{
			System.out.println("An error has just occured! :(");
			io.printStackTrace();
		}
	}
}