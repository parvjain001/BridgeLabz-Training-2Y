package level2;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM_simulation {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Parv Jain", 123456, 5000);

        acc1.displayBalance();
        acc1.deposit(2000);
        acc1.withdraw(3000);
        acc1.withdraw(5000);
        acc1.displayBalance();
    }
}

