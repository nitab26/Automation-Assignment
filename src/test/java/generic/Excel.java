package generic;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel {
	public static String readData(String sheet,int row,int col) throws EncryptedDocumentException, IOException{
		File f=new File("C:\\AutomationPracticeAssignmentProject\\AutomationPractice\\data\\Data.xlsx");
		Workbook wb= WorkbookFactory.create(f);
		String s=wb.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
		return s;
	}

}
