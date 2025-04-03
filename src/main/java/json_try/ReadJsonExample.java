package json_try;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ReadJsonExample {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            User user = mapper.readValue(new File("user.json"), User.class);
            System.out.println("Reading JSON from: " + new File("user.json").getAbsolutePath());
            System.out.println("Name: " + user.getName());
            System.out.println("Age: " + user.getAge());
            System.out.println("Active: " + user.isActive());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
