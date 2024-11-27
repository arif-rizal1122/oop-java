package methodOveriding.person;

public class Manager {
    String name;

    public Manager(String name){
        this.name = name;
    }

    public void sayHello(String name){
        System.out.println("Hello " + name + " my name is Manager " + this.name);
    }
}
