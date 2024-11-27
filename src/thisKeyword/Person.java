package thisKeyword;

class Person {
    String name;
    String address;
    final  String country = "indonesia";

    Person(String conName, String address){
        this.name = conName;
        this.address = address;
    }
    Person(String conName){
        this(conName, null);
    }
    Person(){

    }

    void display(){
        this.display("aimer");
    }
    void display(String name){
        System.out.println("hello " + name +  " my name is " + this.name + " " + this.address);
    }

}
