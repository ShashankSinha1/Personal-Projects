public class BankAccount {
    private String name;
    private String id;
    private double balanceRightNow;
    private int numTransactions;

    public BankAccount(String name, String id, double balance, int numTransactions) {
        this.name = name;
        this.id = id;
        this.balanceRightNow = balance;
    }

    public BankAccount() {
        this.id = "";
        this.balanceRightNow = 0.0;
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalanceRightNow() {
        return balanceRightNow;
    }

    public void setBalanceRightNow(double balance) {
        this.balanceRightNow = balance;
    }

    public int getNumTransactions(){
        return numTransactions;
    }

    public void setNumTransactions(int numTransactions){
        this.numTransactions = numTransactions;
    }

    public void deposit(double amount) {
        balanceRightNow += amount;
        numTransactions++;
    }

    public void withdraw(double amount) {
        if (balanceRightNow > amount) {
            balanceRightNow -= amount;
            numTransactions++;
        }
        if (balanceRightNow < amount){
            System.out.println("You do not have enough money in your balance.");
        }
    }
}
