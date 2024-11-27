package inheritance;

class Manager {
    private String name;

    Manager(String name){
        this.name = name;
    }


    void sayHello(String hello){
        System.out.println("Hello " + hello + " my name is " + this.name);
    }
}