package json_try;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class WriteJsonExample {
    public static void main(String[] args) {
        User user = new User("Amit1234", 5001, true);

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("user.json"), user);
            System.out.println("User saved to JSON!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
