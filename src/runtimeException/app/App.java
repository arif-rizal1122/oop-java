package runtimeException.app;

import exceptionError.person.ValidationException;
import exceptionError.person.ValidationUtil;
import recordClass.person.LoginRequest;
import runtimeException.error.ValidateRuntime;

public class App {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("arif", "buka");
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("data valid : ");
        } catch (ValidationException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("selalu di eksekusi : ");
        }

        LoginRequest loginRequest1 = new LoginRequest("hy", "juga");
        ValidateRuntime.validateRuntime(loginRequest1); // jika error diakan berhenti
        System.out.println("sukses");
    }
}
