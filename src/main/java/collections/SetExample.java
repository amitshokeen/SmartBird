package collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args){
        Set<String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple"); //duplicate

        System.out.println(fruits); //[banana, apple]

        String message = (fruits.contains("banana") || fruits.contains("Banana"))
                ?"There is a banana in the set"
                :"There is no banana in the set";
        System.out.println(message);
    }
}
