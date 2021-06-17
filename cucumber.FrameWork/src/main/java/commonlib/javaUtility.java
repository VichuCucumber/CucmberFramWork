package commonlib;

import java.util.Date;
import java.util.Random;

public class javaUtility {
	
	
	public int getRandomNum(){
		Random ram = new Random();
		int randomNum = ram.nextInt(5000);
		return randomNum;
	}
	
	public String getSystemDate(){
		Date date = new Date();
		String currentDate = date.toString();
	     return currentDate;
	}
	
	public int getmonth(){
		Date date = new Date();
		return date.getMonth();
	}
	
	public int getDtae(){
		Date date = new Date();
		return date.getDate();
	}
	
	public int getYear(){
		Date date = new Date();
		return date.getYear();
	}

}
