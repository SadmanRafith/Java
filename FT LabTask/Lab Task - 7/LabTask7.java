import java.lang.*;
import java.io.*;
import java.util.*;

public class LabTask7{
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);
        String s;


        //Creating the file
        try{
            File newfile = new File("C:\\Users\\TAHSIN\\Desktop\\Lab Task - 7\\pathfolder\\Last.txt");

            if(newfile.createNewFile()){
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			    System.out.println("\n\nA new file is successfully created!!\nFile Name : "+ newfile.getName());
		    }
		    else{
			    System.out.println("The file can not be created or already exists!");
		    }
        }
        catch(IOException io){
            System.out.println("\nError creating file!");
            io.printStackTrace();
        }
        


        //Writing the file
        try{
			FileWriter file = new FileWriter("C:\\Users\\TAHSIN\\Desktop\\Lab Task - 7\\pathfolder\\Last.txt");   // write in the file according to where it is located
        
            System.out.print("\nEnter text : ");

            //Scanner input, from the user
			file.write(s=input.nextLine());

			  
			System.out.println("\nWritten in the file successfully!");
			//System.out.println(getName());
			file.close();                               //closed the file
		}
		catch(IOException io){
			System.out.println("\nAn error has occured! Cannot write the file");
			io.printStackTrace();
		}



        //Reading the file
        try{
            File file = new File("C:\\Users\\TAHSIN\\Desktop\\Lab Task - 7\\pathfolder\\Last.txt");  //location must be the path where the file is saved
            Scanner sc = new Scanner(file);
    
            //checks the condition for the string till it reaches the end
            while(sc.hasNext()){
                String line1 = sc.nextLine();
                System.out.println("\nShowing the written file : "+line1);
                System.out.println("\nFile has been read ");
            }
            sc.close();                                                         //closing the file   
        }
        catch(Exception ex){
            return;
        }


    }
}