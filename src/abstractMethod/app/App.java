package abstractMethod.app;

import abstractMethod.data.Animal;
import abstractMethod.data.Cat;

public class App {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "asep";
        animal.run();

    }
}
