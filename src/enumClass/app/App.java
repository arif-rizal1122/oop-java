package enumClass.app;

import enumClass.person.Level;

class Customer {
    private String name;
    private Level level;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}

public class App {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("arif");
        customer.setLevel(Level.STANDARD); // memilih salah satu enum

        System.out.println(customer.getName());
        System.out.println(customer.getLevel().getDescription());
        System.out.println("=====================================");

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM"); // tidak bisa memasukan enum yg salah
        System.out.println(level);

        System.out.println("======== LIST LEVEL =======");
        for (Level leng : Level.values()){
            System.out.println(leng);
        }


    }

}
