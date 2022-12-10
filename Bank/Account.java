public class Account {
    private double balance;

    public Account(double balance){

        System.out.println("Account's information initializing");
        this.balance=balance;
    }

    public void showDetails(){
        System.out.println("Balance            : "+balance);
    }

    public void sendMoney(Account acc, double amount){

        this.balance = this.balance - amount;
        acc.balance = acc.balance + amount;

    }

}
