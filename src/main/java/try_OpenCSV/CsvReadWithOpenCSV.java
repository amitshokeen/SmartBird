package try_OpenCSV;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileReader;
import java.util.List;

public class CsvReadWithOpenCSV {
    public static void main(String[] args) throws Exception {
        try (FileReader reader = new FileReader("users.csv")) {
            CsvToBean<User> csvToBean = new CsvToBeanBuilder<User>(reader)
                    .withType(User.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<User> users = csvToBean.parse();
            for (User user : users) {
                System.out.println(user.getName() + " - " + user.getAge() + " - " + user.isActive());
            }
        }
    }
}
