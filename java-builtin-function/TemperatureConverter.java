import java.util.Scanner;
public class TemperatureConverter {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Convert to (C/F): ");
        char choice = sc.next().toUpperCase().charAt(0);
        if (choice == 'C') {
            double celsius = fahrenheitToCelsius(temp);
            System.out.println(temp + "°F = " + celsius + "°C");
        } else if (choice == 'F') {
            double fahrenheit = celsiusToFahrenheit(temp);
            System.out.println(temp + "°C = " + fahrenheit + "°F");
        } else {
            System.out.println("Invalid choice! Enter 'C' or 'F'.");
        }
    }
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
