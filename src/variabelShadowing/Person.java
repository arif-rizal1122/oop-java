package variabelShadowing;

class Person {

    String name;
    String address;
    final  String country = "indonesia";

    Person(String conName, String address){
//        this.name = conName;
//        this.address = address;
    }


    void display(){
        System.out.println("my name is " + this.name + " alamat saya " + this.address);
    }

}
