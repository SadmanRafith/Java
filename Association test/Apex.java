import java.lang.*;

public class Apex {

    private int apexid;
    private String name;
    private String apexrank;

    private Valorant val;

    public Apex(int apexid,
                String name,
                String apexrank,
                Valorant val){

                    System.out.println("Initializing Apex Data!!!");
                    this.apexid=apexid;
                    this.name=name;
                    this.apexrank=apexrank;
                    //from here
                    this.val=val;
                }
    
    public void showDetails(){

        System.out.println("Apex ID   : "+apexid);
        System.out.println("Apex Name : "+name);
        System.out.println("Apex Rank : "+apexrank);
        val.showDetails();
    }
    
}
