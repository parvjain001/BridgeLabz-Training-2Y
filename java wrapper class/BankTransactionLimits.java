public class BankTransactionLimits {
    public static double getRemainingLimit(Double limit) {
        if (limit == null)
            return 0.0;
        return limit;
    }

    public static void main(String[] args) {
        Double account1 = 5000.0;
        Double account2 = null;

        System.out.println("Remaining limit (Account 1): " + getRemainingLimit(account1));
        System.out.println("Remaining limit (Account 2): " + getRemainingLimit(account2));
    }
}
