class Book {
    String title;
    String author;
    double price;
    boolean available;

    Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        Book b1 = new Book("Atomic Habits", "James Clear", 450.0, true);
        b1.displayDetails();
        System.out.println();
        b1.borrowBook();
        b1.displayDetails();
        System.out.println();
        b1.borrowBook();
    }
}
