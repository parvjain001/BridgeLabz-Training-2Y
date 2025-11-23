import java.util.*;

public class FeedbackSystem {
    public static void main(String[] args) {
        List<String> allFeedback = new ArrayList<>();
        allFeedback.add("Great service");
        allFeedback.add("Improve delivery time");
        allFeedback.add("Great service");

        Set<String> uniqueFeedback = new HashSet<>(allFeedback);
        Queue<String> processQueue = new LinkedList<>(uniqueFeedback);

        Stack<String> recentStack = new Stack<>();
        for (String f : uniqueFeedback) recentStack.push(f);

        while (!processQueue.isEmpty()) processQueue.poll();

        while (!recentStack.isEmpty()) {
            String last = recentStack.pop();
        }
    }
}
