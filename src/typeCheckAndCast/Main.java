package typeCheckAndCast;



class Employee{
    String name;
    Employee(String name){
        this.name = name;
    }
}

class Manager extends Employee{
    Manager(String name){
        super(name);
    }
}

class VicePresident extends Manager {
    VicePresident(String name){
        super(name);
    }
}



public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("adel");
        Employee manager = new Manager("budi");
        Employee vicePresident = new VicePresident("cerry");

        sayHello(new Employee("anwar"));
        System.out.println("=========================================");
        sayHello(new Manager("bagas"));
        System.out.println("=========================================");
        sayHello(new VicePresident("candra"));
    }


    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello employee " + employee.name);
        }
    }
}
