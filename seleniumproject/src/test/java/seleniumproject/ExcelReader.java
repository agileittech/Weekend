package seleniumproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	Sheet s;

public void reader() throws IOException {
	    FileInputStream fi = new FileInputStream("C:\\Filehandling\\Excelfrompoi.xlsx");
	    Workbook wb = new XSSFWorkbook(fi);
	    s =  wb.getSheet("MySheet");
}	
public void gettingrowsandcells(int rownumber,int cellnumber) {
	if(rownumber==0 && cellnumber==0) {
	    Row r0 =  s.getRow(rownumber);
	    Cell c0 = r0.getCell(cellnumber);
	}else if(rownumber==1 && cellnumber==1) {
	    Row r1 =  s.getRow(rownumber);
	    Cell c1 = r1.getCell(cellnumber);
    }else if(rownumber==2) {
	    Row r2 =  s.getRow(rownumber);
	    Cell c2 = r2.getCell(cellnumber);
    }else if(rownumber==3) {
	    Row r3 =  s.getRow(rownumber);
	    Cell c3 = r3.getCell(cellnumber);
    }else if(rownumber==4) {
	    Row r4 =  s.getRow(rownumber);
	    Cell c4 = r4.getCell(cellnumber);
    }
    }
  public  RichTextString readdata(Cell cellnumber) { 
	  RichTextString s1 = cellnumber.getRichStringCellValue();
	    return s1;
  }
	    
	}


