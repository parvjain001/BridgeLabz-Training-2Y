import java.util.*;

class Question {
    String text;
    Question(String text) {
        this.text = text;
    }
    public String toString() {
        return text;
    }
}

class Student {
    String id;
    Student(String id) {
        this.id = id;
    }
    public String toString() {
        return id;
    }
}

public class ExamSystem {
    public static void main(String[] args) {
        Set<String> studentIDs = new HashSet<>();
        studentIDs.add("S1");
        studentIDs.add("S2");
        studentIDs.add("S1");

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Q1"));
        questions.add(new Question("Q2"));
        questions.add(new Question("Q3"));
        Collections.shuffle(questions);

        Queue<Student> examQueue = new LinkedList<>();
        examQueue.add(new Student("S1"));
        examQueue.add(new Student("S2"));

        Stack<Question> navStack = new Stack<>();
        for (Question q : questions) navStack.push(q);
        while (!navStack.isEmpty()) {
            Question prev = navStack.pop();
        }
    }
}
