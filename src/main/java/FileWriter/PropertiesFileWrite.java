package FileWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileWrite {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\2022 Practice\\Automation\\PropertiesFile\\writeProperties.properties");
		FileOutputStream fos = new FileOutputStream(file);
		Properties pro = new Properties();
		pro.setProperty("1", "murugan");
		pro.setProperty("2", "seetha");
		pro.setProperty("3", "hari");
		
		pro.store(fos, "Storing the keyvalue");
		fos.close();
	}

}
