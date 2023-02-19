package FileReadWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadNotePadFile {

	public static void main(String[] args) throws IOException {

		File file =new File("D:\\2022 Practice\\Automation\\readfile\\notepad.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		int ctr=0;
//		while((line = br.readLine())!=null) {
//			ctr++;
//			if(ctr!=1) {
//				System.out.println(line);
//			}
//				
//		}
		
		StringBuffer sb = new StringBuffer();
		while((line=br.readLine())!=null) {
			sb.append(line+";");
		}
		
		String s = sb.toString();
		
		String arr[] = s.split(";");
		System.out.println(arr[0]);
		
		String arr1[] = arr[0].split(" ");
		for(String a : arr1) {
			System.out.println(a);
		}
				
	}
}
