package constructor;


public class Main {

    public static void main(String[] args) {
        Person person = new Person("agus", "jakarta");
        Person person1 = new Person("asep", "african");

        person1.sayHello();
        person.sayHello();

    }

}
