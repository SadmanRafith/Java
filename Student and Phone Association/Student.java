import java.lang.*;


public class Student {

    //---------------------attributes
    private int id;
    private Phone phones[];

    public Student(int id,
                   int count){

                    this.id=id;
                    phones = new Phone[count];
                    System.out.println("Parameterized constructor of Student!");

                    }

    public void InsertPhone(Phone phn){
        
        int flag=0;

        for(int i=0; i<phones.length; i++){
            if(phones[i]==null){
                phones[i]=phn;

                flag=1;
                break;
            }
        }

        if(flag==1){
            System.out.println("Inserted");
        }
        else{
            System.out.println("Insert Failed");
        }


    }

    public void RemovePhone(Phone phn){

        int flag=0;

        for(int i=0; i<phones.length; i++){
            if(phones[i]==phn){
                phones[i]=null;

                flag=1;
                break;
            }
        }

        if(flag==1){
            System.out.println("Removed");
        }
        else{
            System.out.println("Remove Failed");
        }

    }

    public void DisplayStudent(){

        for(int i=0; i<phones.length; i++){
            if(phones[i] != null){
                System.out.println("Student ID : "+id);
                phones[i].DisplayPhone();
            }
            else{
                System.out.println("Object is not avaialable!");
            }
        }
    }
}