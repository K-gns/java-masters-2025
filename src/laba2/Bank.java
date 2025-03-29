package laba2;

interface AccountOperations {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class BankAccount implements AccountOperations {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if(amount > 0) balance += amount;
    }
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        account1.deposit(500);
        account1.withdraw(300);
        System.out.println("Account1 баланс: " + account1.getBalance());

        BankAccount account2 = new BankAccount(2000);
        account2.deposit(1000);
        account2.withdraw(2500);
        System.out.println("Account2 баланс: " + account2.getBalance());
    }
}
