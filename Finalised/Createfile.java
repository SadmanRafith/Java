import java.io.*;

public class Createfile
{
	public static void main(String []args)
	{
		try{
		File newfile = new File("C:\\Users\\TAHSIN\\Desktop\\Finalised\\Files\\Last.txt");  // location of the file to be created 

		/*
		 * we need to use double slash for the path otherwise it will not work!
		 */


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
