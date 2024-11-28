package polimorphysm;


// Polimorfisme (polymorphism) adalah konsep dalam pemrograman berorientasi objek yang memungkinkan objek dari berbagai kelas yang terkait oleh hierarki pewarisan untuk diolah
// melalui antarmuka yang sama, tetapi berperilaku berbeda berdasarkan jenis objek aktual yang memanggilnya. Dengan kata lain, polimorfisme memungkinkan metode yang sama untuk memiliki
// implementasi yang berbeda ketika dipanggil pada objek dari kelas yang berbeda.

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
          sayHello(new Employee("anwar"));
          System.out.println("=========================================");
          Employee manager = new Manager("budi");
          sayHello(new Manager("bagas"));
          System.out.println("=========================================");
          Employee vicePresident = new VicePresident("cerry");
          sayHello(new VicePresident("candra"));
    }
    static void sayHello(Employee employee){
        System.out.println(employee.name);
    }
}
