import java.io.*;

public class Createfile
{
	public static void main(String []args)
	{
		try{
		File newfile = new File("C:\\Users\\Md. Mazid-Ul-Haque\\Desktop\\JAVA\\03 FILE IO\\Finalised\\Files\\New1.doc");  // location of the file to be created 

		if(newfile.createNewFile())
		{
			System.out.println("A new file is successfully created!!"+ newfile.getName());
		}
		else
		{
			System.out.println("The file can not be created or already exists");
		}

		if(newfile.exists() == true)
		{
			System.out.println("The file exists!!");
		}

		else
		{
			System.out.println("Could not found or does not exist");
		}
		
		

		//newfile.close();


        }
		catch(IOException io)
		{
			System.out.println("An error Occured and failed to create the file");
			io.printStackTrace();
		}



	}
}
