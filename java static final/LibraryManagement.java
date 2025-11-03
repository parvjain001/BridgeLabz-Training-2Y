class Book {
    static String libraryName = "City Central Library";
    final String isbn;
    String title;
    String author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Let Us C", "Yashavant Kanetkar", "ISBN001");
        Book b2 = new Book("Clean Code", "Robert C. Martin", "ISBN002");
        displayLibraryName();
        b1.displayDetails();
        b2.displayDetails();
    }
}
