package accessModifier.data;

// public class mengharuskan memiliki nama yg sama dengan file
public class Product {
    String name;
    int price;
    protected int age;

    Product(String name, int price, int age){
        this.name = name;
        this.price = price;
        this.age = age;
    }

}
