package unitTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataProvider.ExcelDataProvider;

public class TestExcelDataProvider {

	
	@Test
	public void testExcel()
	{
		ExcelDataProvider excel=new ExcelDataProvider();
		
		String value=excel.getStringCellData("UserDetails", 0, 0);
		
		Assert.assertTrue(value.contains("Saumya500"),"Excel Utility is not working");
		
	}
	
}
