package level3;

import java.util.*;

public class CollinearPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.println("Using Slope Method: " + (areCollinearBySlope(x1, y1, x2, y2, x3, y3) ? "Collinear" : "Not Collinear"));
        System.out.println("Using Area Method: " + (areCollinearByArea(x1, y1, x2, y2, x3, y3) ? "Collinear" : "Not Collinear"));
        sc.close();
    }

    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int dx1 = x2 - x1;
        int dy1 = y2 - y1;
        int dx2 = x3 - x2;
        int dy2 = y3 - y2;
        return dy1 * dx2 == dy2 * dx1; // compare slopes without division to avoid divide by zero
    }

    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return area == 0;
    }
}

