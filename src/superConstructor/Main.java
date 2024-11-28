package superConstructor;


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
        manager.sayHello("aviv");
        ViceManager viceManager = new ViceManager("amel");
        viceManager.sayHello("anwar");
    }
}
