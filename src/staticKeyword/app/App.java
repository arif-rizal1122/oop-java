package staticKeyword.app;

import staticKeyword.person.Application;
import staticKeyword.person.*;

public class App {
    public static void main(String[] args) {

        System.out.println(Application.PROCESSOR); // static block
        System.out.println(Constant.APP);
        System.out.println(Constant.Version);

        System.out.println(MathUtil.sum(1, 2, 3, 4, 5, 9));

        // static class
        Country.City city = new Country.City();
        city.setName("subang");


    }
}
