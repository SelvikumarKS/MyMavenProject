package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Read_Data {
	public static void readData() throws IOException {
		File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\TestMaven\\Excel\\datadrivendemo.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);	
		}else if(cellType.equals(cellType.NUMERIC)) {
			CellType numeric =cellType.NUMERIC;
			System.out.println(numeric);
			
		}

		
	}
public static void main(String[] args) throws Exception {
	readData();
	
}
}







