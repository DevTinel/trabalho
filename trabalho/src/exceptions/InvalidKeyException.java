package exceptions;

/**
 * RuntimeException indicating that an invalid key was used in the priority queue.
 */
public class InvalidKeyException extends RuntimeException {

    // Unique identifier for serialization
    private static final long serialVersionUID = 1L;

    // Default constructor with no message
    public InvalidKeyException() {
        super();
    }

    // Constructor that accepts a message
    public InvalidKeyException(String message) {
        super(message);
    }
}
