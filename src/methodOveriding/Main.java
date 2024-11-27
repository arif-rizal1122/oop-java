package methodOveriding;

import methodOveriding.person.Manager;
import methodOveriding.person.ViceManager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("adel");
        manager.sayHello("hanum");

        ViceManager viceManager = new ViceManager("asep");
        viceManager.sayHello("udil");

    }
}
