package reflection.reflect;

import reflection.anot.NotBlank;

public class CreateUserRequest {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername(){
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
