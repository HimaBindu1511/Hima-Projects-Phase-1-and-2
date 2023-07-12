package lesson3practiceproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteAppendExample {
    public static void main(String[] args) {
        String filePath = "path/to/file.txt";

        // Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is a test file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Appending to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write("This is an appended line.");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
