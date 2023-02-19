package FileReadWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CsvFileRead {

	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

		File file =new File("D:\\2022 Practice\\Automation\\readfile\\csvFile.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		StringBuffer sb =new StringBuffer();
		
		String line=null;
		while((line=br.readLine())!=null) {
			
			//System.out.println(line);
			sb.append(line+"\n");
		}
		br.close();
		
		
		String s = sb.toString();
		
		String arr[]=s.split(",");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
	}

}
