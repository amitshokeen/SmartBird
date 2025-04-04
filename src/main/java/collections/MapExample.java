package collections;
import java.util.Scanner;
import java.util.*;

public class MapExample {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String inputSentence;

        System.out.println("Enter sentence: ");
        inputSentence = myScanner.nextLine();

        //System.out.println("Sentence is: " + inputSentence);

        //Split sentence into words
        String[] words = inputSentence.split(" ");

        //Create a map to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1); // first time
            }
        }

        // Print the word frequencies
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
