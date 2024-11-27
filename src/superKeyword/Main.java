package superKeyword;


import superKeyword.shape.Rectangle;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println("dari hasil ovveride nya : " + rectangle.getCorner());
        System.out.println("langsung dari super class nya : " + rectangle.getParentCorner());

    }
}
