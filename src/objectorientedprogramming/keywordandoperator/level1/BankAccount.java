package objectorientedprogramming.keywordandoperator.level1;
class BankAccount {

    // Static
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    // Final
    final int accountNumber;

    // Instance variables
    String accountHolderName;

    // Constructor using this
    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void display(Object obj) {
        if (obj instanceof BankAccount) {
            System.out.println(bankName + " | " + accountHolderName + " | " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Maneesh", 101);
        b1.display(b1);
        BankAccount.getTotalAccounts();
    }
}

