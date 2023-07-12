package CollectionsExample;

import java.util.HashMap;
import java.util.Map;

public class WordMeaningMap {
    public static void main(String[] args) {
        // Create a HashMap to store the word-meaning pairs
        Map<String, String> wordMeaningMap = new HashMap<>();

        // Add word-meaning pairs to the map
        wordMeaningMap.put("apple", "a round fruit with red or green skin and crisp flesh");
        wordMeaningMap.put("cat", "a small domesticated carnivorous mammal");

        // Retrieve the meaning of a word
        String meaning = wordMeaningMap.get("apple");
        System.out.println("Meaning of 'apple': " + meaning);

        // Check if a word exists in the map
        boolean containsWord = wordMeaningMap.containsKey("cat");
        System.out.println("Contains 'cat'? " + containsWord);

        // Remove a word from the map
        wordMeaningMap.remove("apple");

        // Check if a word exists after removal
        boolean containsWordAfterRemoval = wordMeaningMap.containsKey("apple");
        System.out.println("Contains 'apple' after removal? " + containsWordAfterRemoval);
    }
}