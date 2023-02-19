package FileReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XlsxReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File file = new File("D:\\2022 Practice\\Automation\\readfile\\read.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		//Sheet sh = wb.getSheetAt(0);
		Sheet sh = wb.getSheet("Murugan");
		
		int lastrowNo=sh.getLastRowNum();
		
		System.out.println(sh.getRow(1).getCell(3).getNumericCellValue());
		System.out.println("_______");
		for(int i=0;i<lastrowNo;i++) {
			
			int lastcellNo = sh.getRow(i).getLastCellNum();
			
			for(int j=0;j<lastcellNo;j++) {
				Cell c = sh.getRow(i).getCell(j);
				if(sh.getRow(i).getCell(j).getCellType()==CellType.STRING) {
					System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
				}else if(sh.getRow(i).getCell(j).getCellType()==CellType.NUMERIC) {
					System.out.println(sh.getRow(i).getCell(j).getNumericCellValue());
				}
				//System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
		
	}

}
