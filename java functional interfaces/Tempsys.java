import java.util.function.Predicate;

public class Tempsys {
    public static void main(String[] args) {
        double threshold = 37.5;
        Predicate<Double> isHighTemp = temp -> temp > threshold;

        double[] temperatures = {36.5, 37.2, 38.1, 39.0, 36.9};

        for (double temp : temperatures) {
            if (isHighTemp.test(temp)) {
                System.out.println("Alert! Temperature " + temp + "°C crossed the threshold.");
            } else {
                System.out.println("Temperature " + temp + "°C is normal.");
            }
        }
    }
}
