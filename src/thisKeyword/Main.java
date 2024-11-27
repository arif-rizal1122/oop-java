package thisKeyword;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("arif", "malang");
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        person.display("arifin");

        Person person1 = new Person("adul");
        Person person2 = new Person();
        person2.name = "anwar";
        person2.display("uciha");



    }
}
