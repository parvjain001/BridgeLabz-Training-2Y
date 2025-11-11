import java.util.*;

public class WrapperInCollections {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list = new ArrayList<>();

        for (double p : prices)
            list.add(p);

        double max = Collections.max(list);
        double sum = 0;
        for (double price : list)
            sum += price;
        double avg = sum / list.size();

        System.out.println("Highest price: " + max);
        System.out.println("Average price: " + avg);
    }
}
