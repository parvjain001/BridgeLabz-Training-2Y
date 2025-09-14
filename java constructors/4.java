class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    void displayBooking() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        b1.displayBooking();
        System.out.println();
        HotelBooking b2 = new HotelBooking("Parv Jain", "Deluxe", 3);
        b2.displayBooking();
        System.out.println();
        HotelBooking b3 = new HotelBooking(b2);
        b3.displayBooking();
    }
}
