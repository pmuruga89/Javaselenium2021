package General;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class PropertiesClass {

	public static void main(String[] args) throws IOException {

		Properties pro = new Properties();
		pro.setProperty("100", "murugan");
		pro.setProperty("200", "seetha");
		pro.setProperty("300", "hari");
		
		for(Map.Entry temp:pro.entrySet()) {
			System.out.println(temp.getKey()+" "+temp.getValue());
		}
		
		System.out.println("________________Properties file reading_________");
		
		
		File file = new File("D:\\2022 Practice\\Automation\\PropertiesFile\\readProperties.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties pro1 = new Properties();
		pro1.load(fis);
		
		for(Map.Entry temp:pro1.entrySet()) {
			System.out.println(temp.getKey()+" "+temp.getValue());
		}
	}

}
