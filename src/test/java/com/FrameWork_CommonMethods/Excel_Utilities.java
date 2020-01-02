package com.FrameWork_CommonMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utilities {

	public static void main(String[] args) throws IOException {

		String pp = System.getProperty("user.dir");
		System.out.println(pp);
		/*Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString().replace(":", "_").replace(" ", "_"));*/
		
		
		FileInputStream fis = new FileInputStream(pp+"/Test_Data/RTM.xlsx");
		XSSFWorkbook wb    = new XSSFWorkbook(fis);
		int sheetno   = wb.getNumberOfSheets();
		System.out.println(sheetno);
		for(int i=0;i<sheetno;i++)
		{
			if( wb.getSheetName(i).equalsIgnoreCase("SampleRTM"))
			{
				XSSFSheet sheet=wb.getSheetAt(i);
				//System.out.println(i);
				Iterator<Row> rows = sheet.iterator();
				  Row firstrow = rows.next();
				  Iterator<Cell> cell = firstrow.cellIterator();
				   int k = 0;
				   int coloumn = 0;
				   while(cell.hasNext())
				   {
					   Cell cv =cell.next();
					   if(cv.getStringCellValue().equalsIgnoreCase("No Of TestCases"))  
					   {   
						   coloumn = k;			   
					   
				          }
				  k++;
			}
			System.out.println(coloumn);
			
			
		
		}
		
	}

	}
	}
