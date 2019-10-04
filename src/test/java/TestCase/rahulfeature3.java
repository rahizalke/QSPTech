package TestCase;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import TestBase.Testbase1;
import commonMethod.commonMethod;


public class rahulfeature3 extends Testbase1 {

	
	@Test (dataProvider = "Data_Collection")
     public void logintoApplication1(Hashtable<String, String> testData ) throws Exception{
				
		test = extent.startTest("TC001_Create_an_Account");
		 
		
		commonMethod.sendkeys("Xfirstname", testData.get("First_Name"), "First_Name");
		
		
		
		commonMethod.sendkeys("XLastname", testData.get("Last_Name"), "Last_Name");
		
		
		commonMethod.sendkeys("XEmailid", testData.get("Email_ID"), "Email_ID");
		

		
		commonMethod.sendkeys("Xtital", testData.get("JobTital"), "JobTital");


		
		commonMethod.sendkeys("Xphone", testData.get("Phone_Numer"), "Phone_Numer");
		

		
		commonMethod.sendkeys("XCompany", testData.get("company"), "company");
		

		
		
		WebElement employess = driver.findElement(By.xpath(OR.getProperty("XEmploys")));
		Select sel = new Select(employess);
		sel.selectByIndex(3);
		test.log(LogStatus.PASS, "employess has been entered");
		Reporter.log("employess has been entered");
		takeScreenShot();
		
		driver.findElement(By.xpath(OR.getProperty("Xcheckbox"))).click();
		test.log(LogStatus.PASS, "checkboxhas been entered");
		Reporter.log("checkbox has been entered");
		takeScreenShot();
		
	}
}
