package exceptionError.person;
import java.lang.Throwable;



public class ValidationException extends Throwable {
    private String message;
    public ValidationException(String message){
        super(message);
    }
    public String getMessage(){
        return message;
    }
}
