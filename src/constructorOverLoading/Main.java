package constructorOverLoading;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Person person1 = new Person("amel");
        Person person2 = new Person("aviv", "ambon");

        person.display();    // my name is null alamat saya null
        person1.display();   // my name is amel alamat saya null
        person2.display();   // my name is aviv alamat saya ambon

    }
}
