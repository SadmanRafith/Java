import java.lang.*;


public class StaticVar{
    private int a;
    private static int b = 85;

    StaticVar(){
        System.out.println("Empty Constructor!");
    }

    static{
        System.out.println("Static Block");
        b=75;
    }

    public static void main(String[] args) {
        StaticVar s1 = new StaticVar();
        StaticVar s2 = new StaticVar();

        s1.a = 10;
        s2.a = 20;

        System.out.println("s1.a: "+s1.a);
        System.out.println("s2.a: "+s2.a);

        System.out.println("s1.b: "+s2.b);
        System.out.println("s2.b: "+s2.b);

        StaticVar s3 = new StaticVar();

        System.out.println("s3.a: "+s3.a);
        System.out.println("s3.b: "+s3.b);

    }
}
