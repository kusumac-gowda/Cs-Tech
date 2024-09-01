package genericUtility;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class CaptureScreenshotUtility {
	

	public static void captureScreenshot(WebDriver driver, String imageName) throws Exception {
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenshotFolder2\\"+imageName+".png");
		Files.copy(src, dest);
		
	}

}
