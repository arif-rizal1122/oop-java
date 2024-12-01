package getterAndSetter.data;

public class Category {
    private String id;
    private boolean expensive;

    public String getId(){
        return this.id;
    }
    public void setId(String newId){
        if (id != null){
            this.id = newId;
        }
    }

    public boolean isExpensive(){
        return this.expensive;
    }
    public void setExpensive(boolean newExpensive){
        this.expensive = newExpensive;
    }
}
