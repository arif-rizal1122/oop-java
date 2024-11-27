package variabelShadowing;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("adul", "malay");
        Person person1 = new Person("amek", "bali");

        person.display();   // null
        person1.display();  // null

    }
}
