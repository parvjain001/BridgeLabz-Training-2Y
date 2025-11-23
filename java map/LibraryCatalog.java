import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();

        books.put("978-1111111111", "Java Basics");
        books.put("978-2222222222", "Data Structures");
        books.put("978-3333333333", "Operating Systems");
        books.put("978-4444444444", "Computer Networks");

        String searchISBN = "978-2222222222";
        if (books.containsKey(searchISBN))
            System.out.println(books.get(searchISBN));
        else
            System.out.println("Book not found");

        books.remove("978-3333333333");

        TreeMap<String, String> sorted = new TreeMap<>(books);
        for (String isbn : sorted.keySet()) {
            System.out.println(isbn + " : " + sorted.get(isbn));
        }

        String searchTitle = "Java Basics";
        boolean found = false;
        for (String isbn : books.keySet()) {
            if (books.get(isbn).equalsIgnoreCase(searchTitle)) {
                System.out.println("Found at: " + isbn);
                found = true;
            }
        }
        if (!found) System.out.println("Title not found");
    }
}
