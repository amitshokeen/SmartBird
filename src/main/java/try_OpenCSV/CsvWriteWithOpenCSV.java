package try_OpenCSV;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

public class CsvWriteWithOpenCSV {
    public static void main(String[] args) throws Exception {
        List<User> users = Arrays.asList(
                new User("Amit", 35, true),
                new User("John", 28, false)
        );

        try (FileWriter writer = new FileWriter("users.csv")) {
            StatefulBeanToCsv<User> beanToCsv = new StatefulBeanToCsvBuilder<User>(writer).build();
            beanToCsv.write(users);
            System.out.println("CSV written using OpenCSV.");
        }
    }
}
