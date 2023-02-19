package FileReadWrite;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {

//create file
//		File file = new File("D:\\2022 Practice\\Automation\\readfile\\New123.xlsx");
//		if(!file.exists()) {
//			file.createNewFile();
//		}

//Get all file name
		
		File file = new File("D:\\2022 Practice\\Automation\\readfile");

		File f[] = file.listFiles();

		for(File fl:f) {
			
			System.out.println(fl.getName());
			if(fl.getName().equals("notepad.txt")) {
				System.out.println("Yesssssssss");
			}
		}
//length of file
		File file1 = new File("D:\\2022 Practice\\Automation\\readfile\\notepad.txt");

		System.out.println(file1.length()/1024);
		
		
	}

}
