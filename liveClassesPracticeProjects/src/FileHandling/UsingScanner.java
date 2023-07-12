package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) throws IOException {
		File file =new File("./text.txt");
		if(!file.exists())
			file.createNewFile();
		Scanner scanner = new Scanner(file);
		while(scanner.hasNext()) {
			System.out.println(scanner.hasNextLine());
		}
		scanner.close();
		

	}

}
