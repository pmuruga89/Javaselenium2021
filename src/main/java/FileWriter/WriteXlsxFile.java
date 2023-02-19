package FileWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteXlsxFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		File file = new File("D:\\2022 Practice\\Automation\\writefile\\writeXlsx1.xlsx");

		Workbook wb;
		Sheet sh;
		if(!file.exists()) {
			wb = new XSSFWorkbook();
			sh = wb.createSheet("HaiMurugan");
			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			fos.close();
		}
		
		FileInputStream fis = new FileInputStream(file);
		wb=WorkbookFactory.create(fis);
		
		sh = wb.getSheet("HaiMurugan");
		
		for(int i=0;i<=10;i++) {
			
			Row row = sh.getRow(i);
			
			if(row == null) {
				row = sh.createRow(i);
			}
			
			for(int j=0;j<=10;j++) {
				
				Cell c = row.getCell(j);
				
				if(c==null) {
					c = row.createCell(j);
				}
				
				c.setCellValue("hari");
			}
			
		}
		
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		Thread.sleep(10);
		fos.close();

	}

}
