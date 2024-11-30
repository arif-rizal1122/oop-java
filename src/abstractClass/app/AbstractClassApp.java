package abstractClass.app;

import abstractClass.data.Location;

public class AbstractClassApp {
    public static void main(String[] args) {

        // Location location = new Location(); // error
        City city = new City();
        city.name = "afric";
        System.out.println(city.name);


    }
}
