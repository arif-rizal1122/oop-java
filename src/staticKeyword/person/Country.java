package staticKeyword.person;

public class Country {

    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public static class City{
        private String name;
        public String getName(){
            return name;
        }
        public void setName(String newName){
            this.name = newName;
        }


    }
}
