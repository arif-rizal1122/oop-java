package hashCodeMethod.app;

// Kelas Category dengan atribut name dan price
class Category {
    protected int price; // Harga kategori
    protected String name; // Nama kategori

    // Konstruktor untuk menginisialisasi objek Category dengan name dan price
    Category(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Metode equals untuk membandingkan dua objek Category
    @Override
    public boolean equals(Object o) {
        // Jika objek ini dibandingkan dengan dirinya sendiri, return true
        if (this == o) return true;

        // Jika objek yang dibandingkan bukan instance dari Category, return false
        if (!(o instanceof Category)) return false;

        // Casting objek o menjadi tipe Category
        Category category = (Category) o;

        // Membandingkan field price dari kedua objek, jika tidak sama, return false
        if (price != category.price) return false;

        // Membandingkan field name dari kedua objek
        // Jika name tidak null, gunakan metode equals untuk membandingkan konten string
        // Jika name null, cek apakah category.name juga null
        return name != null ? name.equals(category.name) : category.name == null;
    }

    // Metode hashCode untuk mengembalikan nilai hash dari objek
    @Override
    public int hashCode() {
        // Inisialisasi hash dengan angka prime (31)
        int result = 31;

        // Tambahkan hash dari price ke result
        result = 31 * result + price;

        // Jika name tidak null, tambahkan hash dari name ke result
        // Jika name null, tambahkan 0 ke result
        result = 31 * result + (name != null ? name.hashCode() : 0);

        return result;
    }
}

// Kelas Product dengan metode main untuk menjalankan program
public class Product {
    public static void main(String[] args) {
        String first = "adel"; // Inisialisasi string first
        String newFirst = first + " " + "asep"; // Menggabungkan string first dengan string "asep"
        String second = "adel asep"; // Inisialisasi string second dengan nilai yang sama seperti newFirst

        System.out.println(first); // Mencetak nilai first
        System.out.println(newFirst); // Mencetak nilai newFirst

        // Menggunakan operator == untuk membandingkan referensi objek
        // Operator == mengecek apakah kedua referensi menunjuk ke objek yang sama di memori
        System.out.println(newFirst == second); // false, karena newFirst dan second menunjuk ke objek yang berbeda

        // Menggunakan metode equals() untuk membandingkan konten string
        // Metode equals() mengecek apakah konten dari kedua string sama
        System.out.println(newFirst.equals(second)); // true, karena konten dari newFirst dan second sama

        System.out.println("===========================================================");

        // Membuat objek Category dengan nama "agus" dan harga 70
        Category category1 = new Category("agus", 70);
        Category category2 = new Category("agus", 70);

        // Menggunakan metode equals() untuk membandingkan objek category dengan dirinya sendiri
        // Karena objek ini dibandingkan dengan dirinya sendiri, hasilnya true
        System.out.println(category1.equals(category1)); // true

        // Menggunakan metode equals() untuk membandingkan dua objek Category dengan konten yang sama
        System.out.println(category1.equals(category2)); // true

        // Mencetak nilai hashCode dari kedua objek Category
        System.out.println(category1.hashCode()); // hashCode dari category1
        System.out.println(category2.hashCode()); // hashCode dari category2, seharusnya sama dengan category1
    }
}
