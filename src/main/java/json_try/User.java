package json_try;

public class User {
    private String name;
    private int age;
    private boolean active;

    //Getters
    public int getAge() {return this.age;}
    public String getName() {return this.name;}
    public boolean isActive() {return this.active;}

    //Setters
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setActive(boolean active) {this.active = active;}

    public User() {
        // required by Jackson for deserialization
    }

    protected User(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }
}
