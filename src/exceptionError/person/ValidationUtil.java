package exceptionError.person;

import recordClass.person.LoginRequest;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.username() == null){
            throw new ValidationException("username tidak boleh null : ");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("username tidak boleh kosong : ");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("password tidak boleh null : ");
        } else if (loginRequest.password().isBlank()) {
            throw new NullPointerException("password tidak boleh kosong : ");
        }
    }

}
