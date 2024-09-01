package csTech.Assignment;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.CaptureScreenshotUtility;
import genericUtility.SeleniumUtility;
import objectRepository.HomePage;

public class Assignment1 extends BaseClass{
		
		@Test
		public void assignment1() throws Exception {
			SeleniumUtility SUTIL = new SeleniumUtility();
			HomePage hp = new HomePage(driver);
			hp.getUrl1();
			CaptureScreenshotUtility.captureScreenshot(driver, "urlSS1");
			SUTIL.navigateBack(driver);
			hp.getUrl2();
			CaptureScreenshotUtility.captureScreenshot(driver, "urlSS2");
			SUTIL.navigateBack(driver);
			hp.getUrl3();
			CaptureScreenshotUtility.captureScreenshot(driver, "urlSS3");
			SUTIL.navigateBack(driver);
			hp.getUrl4();
			CaptureScreenshotUtility.captureScreenshot(driver, "urlSS4");
			SUTIL.navigateBack(driver);
			hp.getUrl5();
			CaptureScreenshotUtility.captureScreenshot(driver, "urlSS5");
			SUTIL.navigateBack(driver);
		}
		

}
