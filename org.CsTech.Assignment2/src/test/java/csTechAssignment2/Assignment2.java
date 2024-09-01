package csTechAssignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.CaptureScreenshotUtility;
import genericUtility.SeleniumUtility;
import objectRepository2.BulkOrderImport;
import objectRepository2.HomePage;
import objectRepository2.RobotClass;

public class Assignment2 extends BaseClass{
	
	@Test
	public void assignment2() throws Exception {

		SeleniumUtility sutil = new SeleniumUtility();
		HomePage hp = new HomePage(driver);
		hp.clickonOrderDash();
		hp.clickonOrder();
		hp.clickonAddBulkOrders();
		BulkOrderImport bp = new BulkOrderImport(driver);
		bp.clickonChooseFile();
		bp.clickonImportFile();
		bp.clickonValidateData();
		Thread.sleep(2500);
		sutil.acceptAlert(driver);
		RobotClass rc = new RobotClass();
		rc.getZoomOut();
		Thread.sleep(3000);
		CaptureScreenshotUtility.captureScreenshot(driver, "FirstSS");
		WebElement ele = driver.findElement(By.xpath("(//td[contains(@class, 'MuiTableCell')])[34]"));
		Actions act = new Actions(driver);
		act.scrollToElement(ele).perform();
		Thread.sleep(3000);
		CaptureScreenshotUtility.captureScreenshot(driver, "SeccondSS");
		Thread.sleep(3000);

	}

}
