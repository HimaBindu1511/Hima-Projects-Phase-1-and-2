package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class example5 {

	public static void main(String[] args) throws IOException {
		File file =new File("./sample.txt");

		if(!file.exists())	
			file.delete();
			file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(72);
			fos.write(84);
			fos.write(45);
			fos.flush();
			fos.close();
		

	}

}
