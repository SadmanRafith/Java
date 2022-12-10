import java.lang.*;

public class Valorant {

    private String valorank;
    private double playtime;

    public Valorant(String valorank,
                    double playtime){

                        System.out.println("Initializing Valorant Data!!!");
                        this.valorank=valorank;
                        this.playtime=playtime;
                    }
        
    public void showDetails(){

        System.out.println("Valorant Rank     : "+valorank);
        System.out.println("Valorant Playtime : "+playtime+" Hours");
    }
}
