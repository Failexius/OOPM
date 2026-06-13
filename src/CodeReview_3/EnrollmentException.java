package CodeReview_3;

/**
 * Custom Exception for enrollment errors.
 * Covers MLEO_06_02 (custom exception).
 */
public class EnrollmentException extends Exception {
    public EnrollmentException(String message) {
        super(message);
    }
}
