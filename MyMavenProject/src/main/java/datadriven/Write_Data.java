package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.google.common.collect.Table.Cell;

public class Write_Data {

	public static void writeData()  {
		
		File f=new File("C:\\Users\\ADMIN\\Desktop\\bookk.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet ss = wb.getsheet("bookjava");
		Row r = ss.createRow(0);
		Cell c = r.createCell(0);
        c.setCellValue("Username");
        wb.getSheet("bookjava").getRow(0).createCell(1).setCellValue("password");
        wb.getSheet("bookjava").createRow(1).createCell(0).setCellValue("selvikumar");
        wb.getSheet("bookjava").getRow(1).createCell(1).setCellValue("sel@123");
        wb.getSheet("bookjava").createRow(2).createCell(0).setCellValue("madhu");
        wb.getSheet("bookjava").getRow(2).createCell(1).setCellValue("madhu@13");
        wb.getSheet("bookjava").getRow(0).createCell(2).setCellValue("Testcase");
        wb.getSheet("bookjava").getRow(0).createCell(3).setCellValue("Testscenario");
        wb.getSheet("bookjava").getRow(1).createCell(2).setCellValue("login");
        wb.getSheet("bookjava").getRow(1).createCell(3).setCellValue("click login");
        wb.getSheet("bookjava").getRow(2).createCell(2).setCellValue("search");
        wb.getSheet("bookjava").getRow(2).createCell(3).setCellValue("clicksearch");
        wb.getSheet("bookjava").createRow(3).createCell(0).setCellValue("tamil");
        wb.getSheet("bookjava").getRow(3).createCell(1).setCellValue("tamilraj");
        wb.getSheet("bookjava").getRow(3).createCell(2).setCellValue("bookhotel");
        wb.getSheet("bookjava").getRow(3).createCell(3).setCellValue("clickhotel"); 
        FileOutputStream fos=new FileOutputStream(f);
        wb.write(fos);
	}

	public static void main(String[] args) throws Exception {
		writeData();
		
	}




       
		
		

	}

}
