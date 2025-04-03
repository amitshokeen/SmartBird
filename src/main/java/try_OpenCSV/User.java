package try_OpenCSV;

import com.opencsv.bean.CsvBindByName;

public class User {
    @CsvBindByName
    private String name;

    @CsvBindByName
    private int age;

    @CsvBindByName
    private boolean active;

    public User() {}

    public User(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    //Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isActive() { return active; }

    //Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setActive(boolean active) { this.active = active; }
}
