package interfaces.person;

public interface Car {
    void drive();
    int getTier();

    class App {
        public static void main(String[] args) {

            Car car = new Avanza(); // disini yg diinsiasi adalah avanza nya
            System.out.println(car.getTier());
            car.drive();


        }
    }
}
