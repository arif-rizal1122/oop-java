package innerClass.person;

public class Company {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }


    public class Employee {
        private String name;
        public String getName(){
            return name;
        }
        public void setName(String newName){
            this.name = newName;
        }
        public String getCompany(){
            return Company.this.getName(); // atau name
        }
    }


}
