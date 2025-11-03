class BankAccount {
    static String bankName = "Zenith Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Parv", 101, 5000);
        BankAccount a2 = new BankAccount("Shreya", 102, 8000);
        a1.displayDetails();
        a2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
