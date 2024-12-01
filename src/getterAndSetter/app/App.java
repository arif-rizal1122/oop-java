package getterAndSetter.app;

import getterAndSetter.data.Category;

public class App {
    public static void main(String[] args) {

        Category category = new Category();
        category.setId("9");
        category.setExpensive(true);
        System.out.println(category.getId());
        System.out.println(category.isExpensive());


    }
}
