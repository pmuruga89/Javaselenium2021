package FileReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSF_OnlyFor_Xlsx {

	public static void main(String args[]) throws IOException {
		//File file = new File("D:\\2022 Practice\\Automation\\readfile\\read.xlsx");
		File file = new File("D:\\2022 Practice\\Automation\\readfile\\readXls.xls");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		
		Sheet sh = xsf.getSheetAt(0);
		
		for(int i=0;i<sh.getLastRowNum();i++) {
			
			int lastCellNo = sh.getRow(i).getLastCellNum();
			for(int j=0;j<lastCellNo;j++) {
				
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}
	}
	
	

}
