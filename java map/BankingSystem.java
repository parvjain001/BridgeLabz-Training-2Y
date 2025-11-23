import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Map<String, Double> bank = new HashMap<>();

        bank.put("AC001", 50000.0);
        bank.put("AC002", 32000.0);
        bank.put("AC003", 15000.0);
        bank.put("AC004", 70000.0);
        bank.put("AC005", 9000.0);

        String acc = "AC003";
        bank.put(acc, bank.get(acc) + 5000);

        acc = "AC002";
        double amt = 35000;
        if (bank.get(acc) >= amt) bank.put(acc, bank.get(acc) - amt);

        List<Map.Entry<String, Double>> list = new ArrayList<>(bank.entrySet());
        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));
        for (Map.Entry<String, Double> e : list)
            System.out.println(e.getKey() + " : " + e.getValue());

        System.out.println("Top 3:");
        for (int i = 0; i < 3 && i < list.size(); i++)
            System.out.println(list.get(i).getKey() + " : " + list.get(i).getValue());
    }
}
