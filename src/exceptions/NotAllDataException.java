package exceptions;

public class NotAllDataException extends Exception{
    private String message;

    public NotAllDataException(String message) {
        super(message);
    }
}
