import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the Temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5)+32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        sc.close();
    }
}
}