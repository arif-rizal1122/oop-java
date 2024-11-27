package superKeyword.shape;

public class Rectangle extends Shape{

    // overide
    public int getCorner(){
        return 4;
    }
    // ini langsung di class parent nya. karena mengunakan super
    public int getParentCorner(){
        return super.getCorner();
    }

}
