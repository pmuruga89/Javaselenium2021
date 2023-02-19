package FileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsvFile {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\2022 Practice\\Automation\\writefile\\csvFile.csv");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("murugan");
		bw.append(",");
		bw.write("Hari");
		bw.append(",");
		bw.write("krishna");
		bw.newLine();
		bw.write("ponnusamy");
		bw.append(",");
		bw.append("thulasi");
		
		bw.close();
	
		
	}

}
