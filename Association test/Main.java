import java.lang.*;

public class Main{

    public static void main(String[] args) {
        
        
        Valorant v = new Valorant("Radiant", 65);
        //we must initialize Valorant attributes first in order to perform association
        Apex a = new Apex(70, "Tahsin", "Predator", v);

        a.showDetails();
    }
}