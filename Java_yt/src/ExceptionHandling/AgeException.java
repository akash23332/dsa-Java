package ExceptionHandling;

public class AgeException extends Exception {
    public AgeException( ) {
        super("Invalid age: must be 18 or above");

    }
}
