package variableHiding;

class Parent{
    String name;
    void doIt(){
        System.out.println("Do it from Parent");
    }
}

class Child extends Parent{
    String name;
    @Override
    void doIt() {
        System.out.println("Do it from child ");
//        System.out.println("Do it from parent " + super.name);
    }
}


public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "eko";
        child.doIt();
        System.out.println(child.name);

        System.out.println("=====================================");
        // membuat parent dari child (konversi)
        Parent parent = (Parent) child;
        parent.doIt(); // mengakses ke doIt child
        System.out.println(parent.name); // mengakses tetap ke Parent
        // dijava tidak ada isitilah field/attr overiding yg ada hanya method overiding saja;

    }
}
