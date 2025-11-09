class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
public class BankTransactionManager {

    public static void verifyAccount(String accNo) throws AccountNotFoundException {
        if (!accNo.equals("ACC123")) {
            throw new AccountNotFoundException("Account not found for number: " + accNo);
        }
    }
    public static void processTransaction(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance for this transaction!");
        }
        System.out.println("✅ Transaction of ₹" + amount + " successful!");
    }
    public static void executeTransaction(String accNo, double balance, double amount) throws Exception {
        verifyAccount(accNo);
        processTransaction(balance, amount);
    }
    public static void main(String[] args) {
        try {
            executeTransaction("ACC999", 10000, 2000); 
        } catch (AccountNotFoundException e) {
            System.out.println("❌ Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("❌ Transaction failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Unknown error: " + e.getMessage());
        } finally {
            System.out.println("🏁 Transaction complete.");
        }
    }
}
