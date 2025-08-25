import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)){
        
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();
        
        double side = perimeter / 4.0;
        
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
        sc.close();
    }
}
}
