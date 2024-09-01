package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


public class BaseClass {

	public static WebDriver driver = null;
	SeleniumUtility SUTIL = new SeleniumUtility();
	PropertiesUtility PUTIL = new PropertiesUtility();

	@BeforeSuite(alwaysRun = true)
	public void createConnection() {
		System.out.println("connection establish");
	}

	
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception {
		String URL = PUTIL.getDataFromProperties("url");
		SUTIL = new SeleniumUtility();
		driver = new ChromeDriver();
		SUTIL.implictWait(driver, 10);
		SUTIL.maximizeWindow(driver);
		driver.get(URL);
		System.out.println("Launching Successfully");
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
		System.out.println("browser closed sucessfully!!");
	}

	@AfterSuite(alwaysRun = true)
	public void closeConnection() {
		System.out.println("connection closed Sucessfully!!");
	}
}