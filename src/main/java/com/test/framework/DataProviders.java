package com.test.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "testData")
	public static Object[][] readData() throws IOException {
		String callerClassName = new Exception().getStackTrace()[0].getClassName();
		System.out.println("1"+callerClassName);
		
		String dataPath = System.getProperty("user.dir") + "\\dataSheets\\TestCase1.xlsx";
		
		File file = new File(dataPath);
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[lastRowNum][1];

		for (int i = 0; i < lastRowNum; i++) {
			Map<Object, Object> datamap = new HashMap<Object, Object>();
			for (int j = 0; j < lastCellNum; j++) {
				datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());
			}
			obj[i][0] = datamap;
		}
		wb.close();
		return obj;
	}

}