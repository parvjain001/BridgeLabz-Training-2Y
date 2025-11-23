import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        String[] castedVotes = {
            "A", "B", "C", "A", "A", "B", "C", "A", "B", "A"
        };

        for (String candidate : castedVotes) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

        String winner = "";
        int maxVotes = 0;

        for (String candidate : votes.keySet()) {
            int v = votes.get(candidate);
            if (v > maxVotes) {
                maxVotes = v;
                winner = candidate;
            }
        }

        System.out.println("Winner: " + winner);
        for (String candidate : votes.keySet()) {
            System.out.println(candidate + ": " + votes.get(candidate));
        }
    }
}
