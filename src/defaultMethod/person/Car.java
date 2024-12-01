package defaultMethod.person;



public interface Car extends IsMaintanace, HasBrand {

    void drive();
    int getTier();

    default boolean isBig(){
        return false;
    }

}
