package liveclasspraticeproblems;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

class FileCRUDDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the file path: ");
            String filePath = scanner.nextLine();

            // Create operation
            createFile(filePath);

            // Read operation
            readFile(filePath);

            // Update operation
            System.out.print("Enter the new content: ");
            String newContent = scanner.nextLine();
            updateFile(filePath, newContent);

            // Read operation again to verify the update
            readFile(filePath);

            // Delete operation
            deleteFile(filePath);
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void createFile(String filePath) throws IOException {
        File file = new File(filePath);

        if (file.createNewFile()) {
            System.out.println("File created successfully.");
        } else {
            System.out.println("File already exists.");
        }
    }

    public static void readFile(String filePath) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println("File content:");
        System.out.println(content);
    }

    public static void updateFile(String filePath, String newContent) throws IOException {
        Files.write(Paths.get(filePath), newContent.getBytes());
        System.out.println("File updated successfully.");
    }

    public static void deleteFile(String filePath) throws IOException {
        File file = new File(filePath);

        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}