package runtimeException.error;

import recordClass.person.LoginRequest;

public class ValidateRuntime {

        public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null){
            throw new BlankException("username tidak boleh null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("username tidak boleh kosong");
        } else if (loginRequest.password() == null) {
            throw new BlankException("password tidak boleh null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("password tidak boleh kosong");
        }
    }
}
