package recordClass.app;

import recordClass.person.LoginRequest;

public class App {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("adel", "buka");
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);
        System.out.println("===========================================================");
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("arif"));
        System.out.println(new LoginRequest("rizal", "bukaaja"));
        System.out.println("======================================");
        loginRequest.sayHello();
    }
}
