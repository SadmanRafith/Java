import java.lang.*;

 public class ArrayObjectsIssue {
    private int id;
    private String name;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    
    public static void main(String[] args){

        ArrayObjectsIssue s1 = new ArrayObjectsIssue();
        s1.setId(123);
        s1.setName("Tony Stark");
        
        ArrayObjectsIssue s2 = new ArrayObjectsIssue();
        s2.setId(456);
        s2.setName("Bruce Wayne");
        
        ArrayObjectsIssue s3 = new ArrayObjectsIssue();
        s3.setId(789);
        s3.setName("Harry Potter");
        
        //------------------------------------------------------------------creating an array of objects
        ArrayObjectsIssue students[] = new ArrayObjectsIssue[]{s1};

        for(int i=0; i<students.length; i++){
            System.out.println("Students["+i+"].ID: "+students[i].getId());
            System.out.println("Students["+i+"].NAME: "+students[i].getName());
        }

        int flag=0;
        int index=0;
        for(int i=0; i<students.length; i++){
            if(students[i] == s1){
                flag = 1;
                index = i;
            }
            if(flag==1){
                students[i] = null;                                      //assigning null in order to perform delete
                System.out.println("FOUND and DELETED");
            }
            else{
                System.out.println("NOT FOUND");
            }
        }

        /*
         * for null value the compiler will show null as a process of delete
         */

        for(int i=0; i<students.length; i++){
            if(students[i] != null){
                System.out.println("Students["+i+"].ID: "+students[i].getId());
                System.out.println("Students["+i+"].NAME: "+students[i].getName());
            }
            else{
                System.out.println("Students["+i+"].ID: NULL HERE");
                System.out.println("Students["+i+"].NAME: NULL HERE");
            }
        }  
    }
}