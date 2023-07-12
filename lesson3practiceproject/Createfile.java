package lesson3practiceproject; 
import java.io.File; 
import java.io.IOException; 
public class Createfile //*Create a file 
{ 
 public static void main(String[] args) { 
 File myFile = new File("Tejasri.txt"); 
 try { 
 if(myFile.createNewFile()) { 
 System.out.println("File created Successfully..."); 
 } 
 else { 
 System.out.println("File error"); 
 } 
 } catch (IOException e) { 
 e.printStackTrace(); 
 } 
 } 
} 

