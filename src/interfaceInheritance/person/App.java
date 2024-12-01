package interfaceInheritance.person;

public class App {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getBrand());
        System.out.println(car.getTier());
        car.drive();
        System.out.println(car.isMaintanace());

    }
}
