package lesson3practiceproject; 
import java.io.FileWriter; 
import java.io.IOException; 

public class Writefile {
        public static void main(String[] args) { 
              String data ="I'm P Tejasri and I'm From Hyderbad"; 
       try { 
        FileWriter output = new 
       FileWriter("Tejasri.txt"); 
        output.write(data); 
                System.out.println("Data is written successfully"); 
                 output.close(); 
       }
                        catch (IOException e) { 
                 System.out.println("File error...."); 
         } 
      }
    }