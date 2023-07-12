package lesson3practiceproject; 
import java.io.FileWriter; 
import java.io.IOException; 
public class AppendAFile 
{ 
 public static void main(String[] args) { 
 String data = "This data is appended"; 
 try (FileWriter output = new 
 FileWriter("Tejasri.txt", true)) { 
 output.write(data); 
 System.out.println("Data appended successfully..."); 
 } catch (IOException e) { 
 System.out.println("File error.."); 
 e.printStackTrace(); 
 }
 }
}