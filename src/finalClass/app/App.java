package finalClass.app;

// Contoh final class
final class ImmutableClass {
    private final String name;
    private final int value;

    // Konstruktor untuk menginisialisasi field
    public ImmutableClass(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Metode getter untuk mendapatkan nilai name
    public String getName() {
        return name;
    }

    // Metode getter untuk mendapatkan nilai value
    public int getValue() {
        return value;
    }

    // Final method yang tidak bisa di-override oleh subclass
    public final void displayInfo() {
        System.out.println("Name: " + name + ", Value: " + value);
    }
}

// Contoh penggunaan final method dalam non-final class
class BaseClass {
    // Final method yang tidak bisa di-override oleh subclass
    public final void showMessage() {
        System.out.println("This is a final method in BaseClass.");
    }

    // Non-final method yang bisa di-override oleh subclass
    public void display() {
        System.out.println("Display method in BaseClass.");
    }
}

class SubClass extends BaseClass {
    // Method display di-override oleh SubClass
    @Override
    public void display() {
        System.out.println("Display method in SubClass.");
    }

    // showMessage method tidak bisa di-override di sini karena final
    // @Override
    // public void showMessage() {
    //     System.out.println("This would cause a compile-time error.");
    // }
}

public class App {
    public static void main(String[] args) {
        // Membuat objek dari ImmutableClass
        ImmutableClass immutableObject = new ImmutableClass("Test", 100);
        immutableObject.displayInfo(); // Output: Name: Test, Value: 100

        // Membuat objek dari SubClass
        SubClass subClassObject = new SubClass();
        subClassObject.showMessage(); // Output: This is a final method in BaseClass.
        subClassObject.display();     // Output: Display method in SubClass.
    }
}
