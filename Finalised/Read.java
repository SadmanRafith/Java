import java.io.*;
import java.util.*;

class Read
{
	public static void main(String []args)
	{
		try{
		File file = new File("C:\\Users\\TAHSIN\\Desktop\\Finalised\\Files\\Last.txt");  //location must be the path where the file is saved
		Scanner sc = new Scanner(file);


				while(sc.hasNext())
				{
					String line1 = sc.nextLine();
					String line2 = sc.nextLine();
					//String line3 = sc.nextLine();

				 	System.out.println(line1);
					System.out.println(line2);
					//System.out.println(line3);
					System.out.println("////////////////////////////");
					System.out.println("File has been read ");

				}
			System.out.println(file.getName());  // file name print
			System.out.println(file.length());  // file size in byte
			sc.close();   //closing the file 
			
			//System.out.println(file.delete());

 			
		}


		catch(Exception ex)
		{
			return;
		}
	}
}