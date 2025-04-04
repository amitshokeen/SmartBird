package collections;
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        //Add elements
        names.add("Amit");
        names.add("Aditya");
        names.add("Suhani");
        names.add("Sushma");
        names.add("Amit"); // duplicates allowed

        //access by index
        System.out.println(names.get(1));

        //loop through the list
        for (String name : names) {
            System.out.println(name);
        }

        //Size of the list
        System.out.println("Total: " + names.size());

        //remove duplicate elements using a separate ArrayList
        List<String> uniqueNames = new ArrayList<>();
        for (String name: names) {
            if (!uniqueNames.contains(name)){
                uniqueNames.add(name);
            }
        }
        System.out.println("Unique names: " + uniqueNames);

        //remove duplicate names using a Set
        Set<String> uniqueSet = new LinkedHashSet<>(names);
        List<String> uniqueNames1 = new ArrayList<>(uniqueSet);
        System.out.println("Unique names using a Set: " + uniqueNames1);
    }

}
