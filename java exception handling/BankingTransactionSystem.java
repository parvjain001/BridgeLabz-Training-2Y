import java.util.Random;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class NetworkFailureException extends Exception {
    public NetworkFailureException(String message) {
        super(message);
    }
}
public class BankingTransactionSystem {
    private double balance = 10000.0;

    public void transact(double amount) throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        Random rand = new Random();
        int situation = rand.nextInt(4);

        if (amount < 0) throw new NegativeAmountException("Transaction failed: Negative amount entered!");
        if (situation == 1) throw new NegativeAmountException("Transaction failed: Invalid negative transaction detected!");
        if (situation == 2 && amount > balance) throw new InsufficientFundsException("Transaction failed: Insufficient balance!");
        if (situation == 3) throw new NetworkFailureException("Transaction failed: Network issue occurred!");
        
        balance -= amount;
        System.out.println("✅ Transaction successful! Remaining balance: ₹" + balance);
    }
    public static void main(String[] args) {
        BankingTransactionSystem acc = new BankingTransactionSystem();
        try {
            acc.transact(5000);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("🏦 Thank you for using our banking services.");
        }
    }
}
