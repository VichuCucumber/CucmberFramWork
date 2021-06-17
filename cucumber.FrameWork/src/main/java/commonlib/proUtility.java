package commonlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class proUtility {
	
	public String getProValue(String proPath,String key) throws Throwable{
		FileInputStream fils = new FileInputStream(proPath);
		//Workbook wb = WorkbookFactory.create(fils);
		Properties pro = new Properties();
		pro.load(fils);
		String proValue = pro.getProperty(key);
		return proValue;
	}

}
