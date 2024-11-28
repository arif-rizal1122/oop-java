package objectClass;

// saat kita membuat class apapun di java itu sebenarnya kita membuat class turunan dari
// class object yg menjadi super class nya ...

class Manager{
    String name;
    String company;
    Manager(String name){
        this.name = name;
    }
    Manager(String name, String company){
        this.name = name;
        this.company = company;
    }
    void sayHello(String name){
        System.out.println(name + " menyapa " + this.name);
    }
}

class ViceManager extends Manager{
    ViceManager(String name){
        super(name, null);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("arif", "adel");
        System.out.println(manager.toString()); // objectClass.Manager@15aeb7ab
        ViceManager viceManager = new ViceManager("amel");
        System.out.println(viceManager.toString()); // objectClass.ViceManager@6acbcfc0
    }
}
