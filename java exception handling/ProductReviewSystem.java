class InvalidRatingException extends Exception {
    public InvalidRatingException(String message) {
        super(message);
    }
}
class EmptyReviewException extends Exception {
    public EmptyReviewException(String message) {
        super(message);
    }
}
public class ProductReviewSystem {

    public static void submitReview(int rating, String comment) throws InvalidRatingException, EmptyReviewException {
        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException("Invalid rating! Rating must be between 1 and 5.");
        }

        if (comment == null || comment.trim().isEmpty()) {
            throw new EmptyReviewException("Empty review not allowed! Please write a comment.");
        }

        System.out.println("✅ Review submitted successfully! Rating: " + rating + " ⭐");
        System.out.println("💬 Comment: " + comment);
    }

    public static void main(String[] args) {
        try {
            submitReview(6, "Excellent product!");
        } catch (InvalidRatingException e) {
            System.out.println("❌ " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("❌ " + e.getMessage());
        } finally {
            System.out.println("🛍️ Thank you for your feedback!");
        }
    }
}
