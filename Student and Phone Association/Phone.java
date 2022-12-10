import java.lang.*;

public class Phone {
    
    //----------------------attributes
    private String name;
    
    public Phone(String name){
        this.name=name;
        System.out.println("Parameterized constructor of Phone");

    }

    public void DisplayPhone(){
        System.out.println("Phone Model : "+name);
    }
}
