package exceptionError.app;

import exceptionError.person.ValidationException;
import exceptionError.person.ValidationUtil;
import recordClass.person.LoginRequest;

public class App {
    public static void main(String[] args) {
        LoginRequest loginRequest1 = new LoginRequest("", null);

        try {
            ValidationUtil.validate(loginRequest1);
            System.out.println("data valid");
        } catch (ValidationException | NullPointerException exception) {
            // throw new RuntimeException(e);
            System.out.println("data tidak valid : " + exception.getMessage());
        } finally {
            System.out.println("hmkkkk, agar data nya tidak mengantung di memory .....");
        }


    }
}
