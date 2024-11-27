package methodOveriding.person;

public class ViceManager extends Manager{

    public ViceManager(String name){
        super(name);
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name + " my name is Vm " + this.name);
    }
}
