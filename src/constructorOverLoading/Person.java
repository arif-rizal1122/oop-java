package constructorOverLoading;

public class Person {
    String name;
    String address;
    final  String country = "indonesia";

    Person(String conName, String address){
        this.name = conName;
        this.address = address;
    }

    // memanggil constructor yg lain
    Person(String conName){
        this(conName, null);
    }

    Person(){

    }

    void display(){
        System.out.println("my name is " + this.name + " alamat saya " + this.address);
    }

}
