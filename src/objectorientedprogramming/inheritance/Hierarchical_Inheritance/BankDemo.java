package objectorientedprogramming.inheritance.Hierarchical_Inheritance;
class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int acc, double bal, double rate) {
        super(acc, bal);
        interestRate = rate;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(int acc, double bal, int limit) {
        super(acc, bal);
        withdrawalLimit = limit;
    }

    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int tenure;

    FixedDepositAccount(int acc, double bal, int tenure) {
        super(acc, bal);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount(101, 50000, 4.5);
        BankAccount b2 = new CheckingAccount(102, 30000, 5);

        ((SavingsAccount) b1).displayAccountType();
        ((CheckingAccount) b2).displayAccountType();
    }
}
