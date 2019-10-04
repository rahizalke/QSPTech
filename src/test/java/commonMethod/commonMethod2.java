package commonMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import TestBase.Testbase1;

public class commonMethod2 extends Testbase1 {
	
	
	public static void clickOnWebElement(String Xpath, String webelement) throws IOException{
		try {
		driver.findElement(By.xpath(OR.getProperty(Xpath))).click();
		test.log(LogStatus.PASS, webelement+ " has been clicked ");
		takeScreenShot();
		Reporter.log(webelement+ " has been clicked");
		} catch(Throwable t) {
			
			
			test.log(LogStatus.FAIL, webelement+ " is not clicked because of:- "+ t.getMessage());
			takeScreenShot();
			
		}
	}
	
    public static void sendkeys(String Xpath, String data, String webelement) throws IOException{
		
		try {
		driver.findElement(By.xpath(OR.getProperty(Xpath))).sendKeys(data);
		test.log(LogStatus.PASS, webelement+ " has been Entered ");
		takeScreenShot();
		Reporter.log(webelement+ " has been Entered");
		} catch(Throwable t) {
			
			
			test.log(LogStatus.FAIL, "Unable to entr test data in  :-" +webelement+ ". Because of:- "+ t.getMessage());
			takeScreenShot();
	
	}
}


}
