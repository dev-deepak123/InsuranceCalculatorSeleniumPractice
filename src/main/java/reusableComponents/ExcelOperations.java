package reusableComponents;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelOperations {
	String filePath;
    Sheet sh;
	public ExcelOperations(String sheetName) 
 {
	//"C:\\Users\\deepakvishwakarma\\eclipse-workspace\\InsuranceCalculator\\src\\test\\resources\\testData\\Book2.xlsx";
		try {
			filePath = System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\Book21 (2).xlsx";
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		File testDataFile = new File(filePath);
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(testDataFile);
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 sh = wb.getSheet(sheetName);
	}
	
	//get test data from test data sheet in hashmap based on row number
	@SuppressWarnings("deprecation")
	public HashMap<String,String> getTestDataInMap(int rN)  {
		//Location-where is excel file
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
			for(int i=0  ;  i<sh.getRow(rN).getLastCellNum()  ;  i++) {
				sh.getRow(0).getCell(i).setCellType(CellType.STRING);
				hm.put(sh.getRow(0).getCell(i).toString(),sh.getRow(rN).getCell(i).toString());
			}
		
		return hm;
	}
	public static void main(String args[]) throws EncryptedDocumentException, IOException {
		ExcelOperations e = new ExcelOperations("Sheet1");
		System.out.println(e.getTestDataInMap(1));
	}
	
	//get row count
	public int getRowCount() {
		return sh.getLastRowNum();
	}
	
	//get column count
	public int getColCount() {
			return sh.getRow(0).getLastCellNum();
		}

}
