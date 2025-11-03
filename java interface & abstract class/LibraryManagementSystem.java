import java.util.*;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private boolean isReserved;
    private String borrowerName;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
    }

    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    protected void setReserved(boolean reserved) { this.isReserved = reserved; }
    protected void setBorrowerName(String borrowerName) { this.borrowerName = borrowerName; }
    protected String getBorrowerName() { return borrowerName; }

    public boolean isReserved() { return isReserved; }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrowerName(borrowerName);
            setReserved(true);
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved();
    }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrowerName(borrowerName);
            setReserved(true);
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved();
    }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 3;
    }

    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrowerName(borrowerName);
            setReserved(true);
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved();
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(101, "Let Us C", "Yashwant Kanetkar"));
        items.add(new Magazine(102, "Tech Today", "John Smith"));
        items.add(new DVD(103, "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                if (reservable.checkAvailability()) {
                    reservable.reserveItem("Ravi");
                }
                System.out.println("Available: " + reservable.checkAvailability());
            }
            System.out.println();
        }
    }
}
