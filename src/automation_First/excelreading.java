package automation_First;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class excelreading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream file=new FileInputStream("C:/Users/SOMESH/OneDrive/Desktop/New Microsoft Excel Worksheet.xlsx");
  Sheet s=WorkbookFactory.create(file).getSheet("Sheet1");
    /*String a=s.getRow(0).getCell(0).getStringCellValue();
	String b=s.getRow(0).getCell(1).getStringCellValue();
	String c=s.getRow(0).getCell(2).getStringCellValue();
			System.out.println(a+b+c);
			//System.out.println(c);
	*/
  int size=s.getPhysicalNumberOfRows();
  //System.out.println(size);
  
  
  
  for(int i=0;i<size;i++)
  {
	  int cell=s.getRow(i).getPhysicalNumberOfCells();
	 // System.out.println(cell);
	  
	  for(int j=0;j<cell;j++)
	  {
		  String str=s.getRow(j).getCell(i).getStringCellValue();
		  System.out.print(str+" ");
	  }
	  System.out.println();
  }
  
  }
			
			
	}

