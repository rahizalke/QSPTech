package pages;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.Assert;

import TestBase.Testbase1;

public class HomePage extends Testbase1 {
	
	public static void createAnAccount(Hashtable<String, String> testData) throws IOException{
		
		String Actual_title = driver.getTitle();
		Assert.assertEquals(Actual_title, "My Store");
		passLogStatus("User as been redirected to the " + Actual_title + " Applaction.");
		
		
		
	}
	
	

}
