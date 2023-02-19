package FileReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String args[]) throws IOException {
		
		File file = new File("D:\\2022 Practice\\Automation\\PropertiesFile\\readProperties.properties");
		
		//FileReader fr = new FileReader(file);
		FileInputStream fr = new FileInputStream(file);
		
		Properties pro = new Properties();
		
		pro.load(fr);
		
		for(Map.Entry temp:pro.entrySet()) {
			
			System.out.println(temp.getKey() + "  "+temp.getValue());
		}
		
	}
}
