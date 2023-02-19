package FileReadWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NotepadFileUsingFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file =new File("D:\\2022 Practice\\Automation\\readfile\\notepad.txt");

		FileReader fr = new FileReader(file);
		int line =0;
		while((line = fr.read())!=-1) {
			System.out.print((char)line);
		}
	}

}
