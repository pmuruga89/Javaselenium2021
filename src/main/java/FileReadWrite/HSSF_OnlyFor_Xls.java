package FileReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class HSSF_OnlyFor_Xls {

	public static void main(String[] args) throws IOException {

		//File file = new File("D:\\2022 Practice\\Automation\\readfile\\readXls.xls");
		File file = new File("D:\\2022 Practice\\Automation\\readfile\\read.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		HSSFWorkbook hsf = new HSSFWorkbook(fis);
		

		int sheetNo = hsf.getNumberOfSheets();
		String sheetName = null;
		for(int i=0;i<sheetNo;i++) {
			
			if(hsf.getSheetAt(i).getSheetName().equals("Murugan")) {
				System.out.println("Yes:::::::::: "+hsf.getSheetAt(i).getSheetName());
				sheetName=hsf.getSheetAt(i).getSheetName();
			}
		}
		
		
		HSSFSheet s = hsf.getSheet(sheetName);
		
		for(int i=0;i<s.getLastRowNum();i++) {
			
			int lastCellNo = s.getRow(i).getLastCellNum();
			
			for(int j=0;j<lastCellNo;j++) {
				
				if(s.getRow(i).getCell(j).getCellType()==CellType.STRING) {
					System.out.println(s.getRow(i).getCell(j).getStringCellValue());
				}
			}
			
		}
		hsf.close();
	}

}
