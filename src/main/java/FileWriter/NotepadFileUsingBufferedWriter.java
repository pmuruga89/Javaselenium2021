package FileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NotepadFileUsingBufferedWriter {

	public static void main(String args[]) throws IOException {
		
		File file = new File("D:\\2022 Practice\\Automation\\writefile\\notepad.txt");
		FileWriter fr = new FileWriter(file);
		BufferedWriter br = new BufferedWriter(fr);
		br.write("Hi");
		br.newLine();
		br.write("Hello");
		br.append("\n");
		br.write("man");
		
		br.close();
	}
}
