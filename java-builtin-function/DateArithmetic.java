import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input, formatter);

        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("Modified Date: " + modifiedDate.format(formatter));
        sc.close();
    }
}
