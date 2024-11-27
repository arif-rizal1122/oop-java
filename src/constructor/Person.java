package constructor;

class Person {
    String name;
    String address;
    final String country = "indonesia";

    Person(String name, String address){
         this.name = name;
         this.address = address;
    }


    void sayHello(){
        System.out.println("Hello " + this.name + ", my name is " + this.address);
    }
}
