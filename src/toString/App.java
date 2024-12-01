package toString;

public class App {
    public static void main(String[] args) {
        Product product = new Product("mobil", 70);
//        System.out.println(product.toString()); // yg dioveride
        System.out.println(product);
    }
}
