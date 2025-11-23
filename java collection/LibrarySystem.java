import java.util.*;

class Book {
    String title;
    Book(String title) { this.title = title; }
    public String toString() { return title; }
}

public class LibrarySystem {
    public static void main(String[] args) {
        List<Book> allBooks = new ArrayList<>();
        allBooks.add(new Book("C Programming"));
        allBooks.add(new Book("Java Basics"));
        allBooks.add(new Book("DSA Guide"));

        Set<String> members = new HashSet<>();
        members.add("M1");
        members.add("M2");
        members.add("M1");

        Queue<Book> issueQueue = new LinkedList<>();
        issueQueue.add(allBooks.get(0));
        issueQueue.add(allBooks.get(1));

        Stack<Book> returnedStack = new Stack<>();
        returnedStack.push(new Book("Python Handbook"));

        if (!issueQueue.isEmpty()) issueQueue.poll();

        if (!returnedStack.isEmpty()) {
            Book reissue = returnedStack.pop();
            issueQueue.add(reissue);
        }
    }
}
