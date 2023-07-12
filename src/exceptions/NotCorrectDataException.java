package exceptions;

public class NotCorrectDataException extends Exception{
    private String message;

    public NotCorrectDataException(String message){
        super(message);
    }
}
