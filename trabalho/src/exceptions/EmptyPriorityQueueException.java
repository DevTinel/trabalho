package exceptions;

/**
 * RuntimeException indicating that the priority queue is empty.
 */
public class EmptyPriorityQueueException extends RuntimeException {

    // Unique identifier for serialization
    private static final long serialVersionUID = 1L;

    // Default constructor with no message
    public EmptyPriorityQueueException() {
        super();
    }

    // Constructor that accepts a message
    public EmptyPriorityQueueException(String message) {
        super(message);
    }
}
