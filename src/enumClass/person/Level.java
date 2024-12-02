package enumClass.person;

public enum Level {

    STANDARD("standard edition"),
    PREMIUM("premium edition"),
    VIP("vip edition");

    private String description;
    Level(String description){
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
