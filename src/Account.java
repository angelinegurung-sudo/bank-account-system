public class Account {

    private double balance;
    private String accountHolder;
    private int accountNumber;

    public Account(double balance, String accountHolder, int accountNumber) {
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if ( amount <= 0 ) {
            System.out.println("Amount must be at least £0.01");
        } else {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {

        if ( amount > balance ) {
            System.out.println("you do not have sufficient funds in your account");
        } else {
            this.balance -= amount;
        }
    }

    public double getBalance() {

        return balance;
    }

}
