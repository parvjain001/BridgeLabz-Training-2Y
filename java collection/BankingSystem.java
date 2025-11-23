import java.util.*;

class Account {
    String id;
    double balance;
    Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        return id.equals(((Account)o).id);
    }
    public int hashCode() {
        return Objects.hash(id);
    }
}

class Transaction {
    String accountId;
    double amount;
    Transaction(String accountId, double amount) {
        this.accountId = accountId;
        this.amount = amount;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Set<Account> validAccounts = new HashSet<>();
        validAccounts.add(new Account("A1", 5000));
        validAccounts.add(new Account("A2", 3000));

        Queue<Transaction> pending = new LinkedList<>();
        pending.add(new Transaction("A1", -500));
        pending.add(new Transaction("A2", 1000));
        pending.add(new Transaction("A3", -200));

        List<Transaction> allTransactions = new ArrayList<>();
        Stack<Transaction> rollbackStack = new Stack<>();

        while (!pending.isEmpty()) {
            Transaction t = pending.poll();
            Optional<Account> acc = validAccounts.stream()
                    .filter(a -> a.id.equals(t.accountId)).findFirst();
            if (acc.isPresent()) {
                acc.get().balance += t.amount;
                allTransactions.add(t);
                rollbackStack.push(t);
            }
        }

        if (!rollbackStack.isEmpty()) {
            Transaction last = rollbackStack.pop();
            validAccounts.stream()
                .filter(a -> a.id.equals(last.accountId))
                .findFirst().get().balance -= last.amount;
        }
    }
}
