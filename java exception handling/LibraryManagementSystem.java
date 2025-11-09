import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
class InvalidReturnException extends Exception {
    public InvalidReturnException(String message) {
        super(message);
    }
}
class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String message) {
        super(message);
    }
}
public class LibraryManagementSystem {
    private static HashMap<String, Boolean> books = new HashMap<>();
    private static HashMap<String, Set<String>> userRecords = new HashMap<>(); 
    static {
        books.put("Java Basics", true);
        books.put("Python Programming", true);
        books.put("C Language", true);
        books.put("Data Structures", true);
    }
    public static void borrowBook(String user, String bookName)
            throws BookNotAvailableException, UserLimitExceededException {
        if (!books.containsKey(bookName) || !books.get(bookName)) {
            throw new BookNotAvailableException("Book '" + bookName + "' is not available!");
        }
        userRecords.putIfAbsent(user, new HashSet<>());
        Set<String> borrowed = userRecords.get(user);

        if (borrowed.size() >= 5)
            throw new UserLimitExceededException("You cannot borrow more than 5 books!");

        borrowed.add(bookName);
        books.put(bookName, false);
        System.out.println("✅ " + user + " borrowed '" + bookName + "'.");
    }

    public static void returnBook(String user, String bookName) throws InvalidReturnException {
        if (!userRecords.containsKey(user) || !userRecords.get(user).contains(bookName)) {
            throw new InvalidReturnException("You cannot return a book you haven't borrowed!");
        }

        userRecords.get(user).remove(bookName);
        books.put(bookName, true);
        System.out.println("✅ " + user + " returned '" + bookName + "'.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "Parv";

        try {
            borrowBook(user, "Java Basics");
            borrowBook(user, "Python Programming");
            returnBook(user, "C Language");
        } catch (BookNotAvailableException | InvalidReturnException | UserLimitExceededException e) {
            System.out.println("❌ " + e.getMessage());
        } finally {
            System.out.println("📖 Library operation complete.");
        }

        sc.close();
    }
}
