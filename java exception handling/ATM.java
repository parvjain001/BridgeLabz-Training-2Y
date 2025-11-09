class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class ATM {
    private int balance = 10000;

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed! Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();

        try {
            atm.withdraw(12000); 
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            atm.withdraw(5000); 
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
