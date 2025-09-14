class Book {
    String title;
    String author;
    double price;

    Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.displayDetails();
        System.out.println();
        Book b2 = new Book("Atomic Habits", "James Clear", 450.50);
        b2.displayDetails();
    }
}