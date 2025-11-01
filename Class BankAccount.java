class BankAccount {
    private double balance;
    private String accountNumber;

    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance - amount >= 100) { // threshold = 100
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance! Withdrawal not allowed.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("AC123", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(1300);
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
