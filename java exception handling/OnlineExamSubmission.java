import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

class LateSubmissionException extends Exception {
    public LateSubmissionException(String message) {
        super(message);
    }
}

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String message) {
        super(message);
    }
}

public class OnlineExamSubmission {
    private static final LocalDateTime DEADLINE = LocalDateTime.of(2025, 11, 10, 23, 59);

    public static void submitExam(String fileName, LocalDateTime submissionTime)
            throws LateSubmissionException, InvalidFileFormatException {

        if (!fileName.endsWith(".pdf")) {
            throw new InvalidFileFormatException("Submission failed: invalid file format. Only .pdf allowed.");
        }

        if (submissionTime.isAfter(DEADLINE)) {
            throw new LateSubmissionException("Submission failed: you submitted after the deadline!");
        }

        System.out.println("✅ Exam submitted successfully!");
    }

    public static void main(String[] args) {
        try {
            String file = "exam_answers.docx";
            LocalDateTime now = LocalDateTime.now();

            submitExam(file, now);
        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        } catch (LateSubmissionException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("🕒 Exam submission process completed.");
        }
    }
}
