import java.lang.*;


public class InitializerVar {
    private int acn;
    private double bal;                         // instance variable
    private static double pdtl = 10;            // class variable

    public void PrintMSG(){
        System.out.println("Static Variable is : "+pdtl);
    }

    // for static method ------------------------------

    public static void main(String[] args) {
        InitializerVar i = new InitializerVar();
        i.PrintMSG();

        // after setter --------------------

    }

}
