package AssistedPracticeProjects;

import java.util.regex.*;
public class RegularExpressionExample {
 public static void main(String[] args) {
 String text = "The quick brown fox jumps over the lazy dog.";
 
 // Check if the text contains "brown" using matches()
 
 boolean containsBrown = text.matches(".*brown.*");
 System.out.println("Contains 'brown': " + containsBrown);
 // Find all occurrences of words starting with 'o' using find()
 Pattern pattern = Pattern.compile("\\bo\\w*");
 Matcher matcher = pattern.matcher(text);
 System.out.println("\nWords starting with 'o':");
 while (matcher.find()) {
	 System.out.println(matcher.group());
	 }
 
	 // Replace all occurrences of 'lazy' with 'active' using replaceAll()
 
	 String modifiedText = text.replaceAll("lazy", "active");
	 System.out.println("\nModified Text: " + modifiedText);
 }
}