package objectorientedprogramming.accessmodifiers;
class BankAccount {
    public int accountNumber;          // public
    protected String accountHolder;    // protected
    private double balance;            // private

    // Public methods for private balance
    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);   // public
        System.out.println("Account Holder : " + accountHolder);   // protected
        System.out.println("Balance        : " + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = 12345;
        sa.accountHolder = "Maneesh";
        sa.deposit(10000);

        sa.displayAccountDetails();
    }
}
