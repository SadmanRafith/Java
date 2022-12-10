public class AccountHolder extends Person {
    private int AccNumber;

    //association here
    // Account Holder ----- Account
    private Account acc;        

    public AccountHolder(){}

    public AccountHolder(int id,
                        String name,
                        int AccNumber,
                        Account acc){

                            super(id, name);
                            System.out.println("Account Holder's information initializing!!!");
                            this.AccNumber=AccNumber;

                            //----------------------------
                            this.acc=acc;
                        }

    public void showDetails(){
        super.showDetails();
        System.out.println("Account Number     : "+AccNumber);
        acc.showDetails();
    }
}
