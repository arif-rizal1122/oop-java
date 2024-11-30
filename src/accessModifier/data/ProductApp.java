package accessModifier.data;

import accessModifier.application.Data;

public class ProductApp {
    public static void main(String[] args) {
        // protected masih bisa diakses jika masih dalam package yg sama
        Product product = new Product("anwar", 90,8);
        System.out.println(product.name + ", " + product.price);
        System.out.println(product.age);
        System.out.println("===============================");

        Data data = new Data(70, "food");
        // System.out.println(data.qty); // tidak bisa diakses karena berbeda package
        // System.out.println(data.category);


    }
}
