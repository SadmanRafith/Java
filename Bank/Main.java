public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(12, "Tahsin");
        Account a1 = new Account(4500.50);
        Account a2 = new Account(3500.50);
        AccountHolder ah1 = new AccountHolder(11, "Disha", 45, a1);

        p1.showDetails();
        System.out.println("--------------------------------------");
        System.out.println("Association");
        ah1.showDetails();

        System.out.println("--------------------------------------");
        System.out.println("Before sending money");
        a1.showDetails();
        a2.showDetails();

        
        a2.sendMoney(a1, 500);
        System.out.println("--------------------------------------");
        System.out.println("After sending money");
        a1.showDetails();
        a2.showDetails();



        //-------------------------------
        //a1.showDetails();

    }
}
