public class MyAccount {
    public static void main(String [] args){
        BankAccount Shashank = new BankAccount();

        Shashank.setName("Shashank");
        Shashank.setId("00978993");
        Shashank.setBalanceRightNow(4000);


        Shashank.deposit(220);
        Shashank.withdraw(759); //rent
        Shashank.withdraw(50); //food for the month
        Shashank.withdraw(168); //groceries this month

        System.out.println("Balance = " + Shashank.getBalanceRightNow());
        System.out.println("Number of transactions = " + Shashank.getNumTransactions());

    }
}
