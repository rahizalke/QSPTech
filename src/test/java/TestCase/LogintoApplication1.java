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


public class LogintoApplication1 extends Testbase1 {

	
	@Test (dataProvider = "Data_Collection")
     public void logintoApplication1(Hashtable<String, String> testData ) throws Exception{
				
		test = extent.startTest("TC001_Create_an_Account");
		 
		
		commonMethod.sendkeys("Xfirstname", testData.get("First_Name"), "First_Name");
		
		//driver.findElement(By.xpath(OR.getProperty("Xfirstname"))).sendKeys(testData.get("First_Name"));
		//test.log(LogStatus.PASS, "First_Name has been entered");
		//Reporter.log("First_Name has been entered");
		//takeScreenShot();
		
		commonMethod.sendkeys("XLastname", testData.get("Last_Name"), "Last_Name");
		
		//driver.findElement(By.xpath(OR.getProperty("XLastname"))).sendKeys(testData.get("Last_Name"));
		//test.log(LogStatus.PASS, "Last_Name has been entered");
		//Reporter.log("Last_Name has been enteredd");
		//takeScreenShot();
		
		commonMethod.sendkeys("XEmailid", testData.get("Email_ID"), "Email_ID");
		
//		driver.findElement(By.xpath(OR.getProperty("XEmailid"))).sendKeys(testData.get("Email_ID"));
//		test.log(LogStatus.PASS, "Email_ID has been entered");
//		Reporter.log("Email_ID has been entered");
//		takeScreenShot();
		
		commonMethod.sendkeys("Xtital", testData.get("JobTital"), "JobTital");

//		driver.findElement(By.xpath(OR.getProperty("Xtital"))).sendKeys(testData.get("JobTital"));
//		test.log(LogStatus.PASS, "JobTital has been entered");
//		Reporter.log("JobTital has been entered");
//		takeScreenShot();
		
		commonMethod.sendkeys("Xphone", testData.get("Phone_Numer"), "Phone_Numer");
		
//		driver.findElement(By.xpath(OR.getProperty("Xphone"))).sendKeys(testData.get("Phone_Numer"));
//		test.log(LogStatus.PASS, "Phone_Numer has been entered");
//		Reporter.log("Phone_Numer has been entered");
//		takeScreenShot();
		
		commonMethod.sendkeys("XCompany", testData.get("company"), "company");
		
//		
//		driver.findElement(By.xpath(OR.getProperty("XCompany"))).sendKeys(testData.get("company"));
//		test.log(LogStatus.PASS, "company has been entered");
//		Reporter.log("company has been entered");
//		takeScreenShot();
		
		
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
