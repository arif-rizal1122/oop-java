package method;



public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Person person1 = new Person();
        person.name = "arif";
        person.address = "jawa";
        // person country tidak bisa karena final
        person1.name = "amel";


        person.sayHello("adel");

    }
}
