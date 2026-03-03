/**
 * Custom exception — thrown when an executive bonus is below the minimum threshold.
 */
public class BonusTooLowException extends Exception {
    public BonusTooLowException() {
        super();
    }

    public BonusTooLowException(String msg) {
        super(msg);
    }
}
