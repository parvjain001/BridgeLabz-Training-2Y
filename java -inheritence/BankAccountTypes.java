class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int depositTerm;

    FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", 50000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 30000, 20000);
        FixedDepositAccount fixed = new FixedDepositAccount("FD24680", 100000, 12);

        savings.displayAccountType();
        System.out.println();
        checking.displayAccountType();
        System.out.println();
        fixed.displayAccountType();
    }
}
