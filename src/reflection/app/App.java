package reflection.app;

import reflection.reflect.CreateUserRequest;
import reflection.reflect.ExceptionE;

public class App {
    public static void main(String[] args) {

        CreateUserRequest req = new CreateUserRequest();
        req.setUsername("arif");
        req.setPassword("buka");

        ExceptionE.validationReflection(req);

    }
}
