package level2;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean booked;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.booked = false;
    }
    void bookTicket(int seatNumber, double price) {
        if (!booked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.booked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat already booked!");
        }
    }
    void displayDetails() {
        if (booked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        } else {
            System.out.println("No ticket booked yet for " + movieName);
        }
    }
}
public class MovieTicketmain {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers:Endgame");

        ticket1.displayDetails();
        ticket1.bookTicket(12, 250);
        ticket1.displayDetails();
        ticket1.bookTicket(15, 300);
    }
}
