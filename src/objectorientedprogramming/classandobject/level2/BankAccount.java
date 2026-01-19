package objectorientedprogramming.classandobject.level2;
/*
Program to Simulate an ATM
Problem Statement:
Create a BankAccount class with deposit, withdraw and balance display methods.
*/

class BankAccountDetails {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccountDetails(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        BankAccountDetails account = new BankAccountDetails("Ravi", 12345, 10000);

        account.deposit(2000);
        account.withdraw(3000);
        account.displayBalance();
    }
}