public class BankAccount {
    private String name;
    private String id;
    private double balance;
    private int numTransactions;

    public BankAccount(String name, String id, double balance, int numTransactions) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public BankAccount() {
        this.id = "";
        this.balance = 0.0;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumTransactions(){
        return numTransactions;
    }

    public void setNumTransactions(int numTransactions){
        this.numTransactions = numTransactions;
    }

    public void deposit(double amount) {
        balance += amount;
        numTransactions++;
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            numTransactions++;
        }
        if (balance < amount){
            System.out.println("You do not have enough money in your balance.");
        }
    }
}
