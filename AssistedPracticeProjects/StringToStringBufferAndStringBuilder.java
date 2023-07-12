package AssistedPracticeProjects;

public class StringToStringBufferAndStringBuilder {
 public static void main(String[] args) {
 // Create a string
	 
 String str = "Hello, world!";
 // Convert string to StringBuffer
 
 StringBuffer stringBuffer = new StringBuffer(str);
 // Convert string to StringBuilder
 
 StringBuilder stringBuilder = new StringBuilder(str);
 // Display the converted StringBuffer
 
 System.out.println("StringBuffer: " + stringBuffer);
 // Display the converted StringBuilder
 
 System.out.println("StringBuilder: " + stringBuilder);
 }
}
