package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		File file =new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
	FileInputStream fis=new FileInputStream(file);
	int asciiCode;
	String text=new String();
	while((asciiCode = fis.read())!=-1) {
		text +=String.valueOf((char)asciiCode);
		//System.out.print((char)asciiCode);
	}
	System.out.println();
	System.out.println(text);
fis.close();
	}

}
