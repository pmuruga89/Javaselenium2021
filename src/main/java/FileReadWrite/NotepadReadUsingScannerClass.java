package FileReadWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NotepadReadUsingScannerClass {

	public static void main(String[] args) throws FileNotFoundException {

		File file =new File("D:\\2022 Practice\\Automation\\readfile\\notepad.txt");
		
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
	}

}
