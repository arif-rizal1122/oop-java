package field;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Person person1 = new Person();
        person.name = "arif";
        person.address = "jawa";
        // person country tidak bisa karena final
        person1.name = "amel";

        System.out.println(person.name + " orang " + person.address + " yg tinggal di " + person.country);
        System.out.println(person1.name);
    }
}
