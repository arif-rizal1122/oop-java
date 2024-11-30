package imports.app;
// menambahkan tanda * setelah pakage data itu sama saja mengambil semua data
import imports.data.Product;

public class App {
    public static void main(String[] args) {

        Product product = new Product("asep");
        System.out.println(product.name);

    }
}
