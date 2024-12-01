package defaultMethod.person;

public class Avanza implements Car{
    public void drive(){
        System.out.println("Avanza : ");
    }
    public int getTier(){
        return 4;
    }
    public String getBrand(){
        return "toyota";
    }
    public boolean isMaintanace(){
        return false;
    }

}
