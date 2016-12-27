package e2eTests;

import utils.Constants;
import utils.XlUtils;

public class XLTest {

	public static void main(String[] args) {
		 
		try {
			XlUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, "Sheet1");
			
			
			System.out.println(XlUtils.getCellData(1, 1));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
