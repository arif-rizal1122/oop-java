package recordClass.person;

public record LoginRequest(String username, String password) { // default param nya adl final

    // membuat constructor di record class tanpa ()


    // membuat constructor di record class dengan ()
    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("", "");
    }
    public void sayHello(){
        System.out.println("Hello :" + this.username + ", pass :" + this.password);
    }

}
