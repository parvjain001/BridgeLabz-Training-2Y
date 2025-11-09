import java.io.IOException;

class InvalidStudentException extends Exception {
    public InvalidStudentException(String message) {
        super(message);
    }
}

public class OnlineExamSystem {

    public static void validateStudent(String studentId) throws InvalidStudentException {
        if (!studentId.equals("S123")) {
            throw new InvalidStudentException("Invalid student ID! Access denied.");
        }
    }

    public static void submitExam(String studentId) throws InvalidStudentException, IOException {
        validateStudent(studentId);

        boolean networkError = Math.random() < 0.5;
        if (networkError) {
            throw new IOException("Network error occurred during submission!");
        }

        System.out.println("✅ Exam submitted successfully!");
    }

    public static void main(String[] args) {
        try {
            submitExam("S999");
        } catch (InvalidStudentException e) {
            System.out.println("❌ Student validation failed: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("❌ Exam submission error: " + e.getMessage());
        } finally {
            System.out.println("📘 Exam submission process completed.");
        }
    }
}
