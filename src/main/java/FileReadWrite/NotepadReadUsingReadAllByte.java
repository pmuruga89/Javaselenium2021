package FileReadWrite;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NotepadReadUsingReadAllByte {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =new File("D:\\2022 Practice\\Automation\\readfile\\notepad.txt");

		String s = new String(Files.readAllBytes(Paths.get("D:\\2022 Practice\\Automation\\readfile\\notepad.txt")));
		System.out.println(s);
	}

}
