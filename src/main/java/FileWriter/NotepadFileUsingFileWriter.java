package FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NotepadFileUsingFileWriter {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\2022 Practice\\Automation\\writefile\\notepad.txt");
		
		
		if(!file.exists()) {
			
			file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file);
		
		fw.write("murugan");
		fw.append("\n");
		fw.write("jeevamuruagn");
		fw.append("\n");
		fw.write("hari");
		
		
		fw.close();

	}

}
