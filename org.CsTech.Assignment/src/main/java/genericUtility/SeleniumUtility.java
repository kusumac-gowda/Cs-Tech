package genericUtility;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class SeleniumUtility {

	
	Actions act = null;
	

	/**
	 * this is generic method for implicit wait
	 * 
	 * @param particularSeconds
	 */

	public void implictWait(WebDriver driver , int particularSeconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(particularSeconds));
	}

	/**
	 * this is a generic method for maximize the window
	 * 
	 */

	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/*---------------------Actions class generic functions----------------*/

	/**
	 * this is a generic method for right click operation of an element
	 * 
	 * @param element
	 */

	public void rightClickOnAnElement(WebDriver driver, WebElement element) {
		act = new Actions(driver);
		act.contextClick(element).perform();
	}

	/**
	 * this is a generic method for click operation of an element
	 * 
	 * @param element
	 */

	public void clickOnAnElement(WebDriver driver, WebElement element) {
		act = new Actions(driver);
		act.click(element).perform();
	}

	/**
	 * this is a generic method to perform drag and drop element
	 * 
	 * @param src
	 * @param target
	 */

	public void dragAndDropAnElement(WebDriver driver, WebElement src, WebElement target) {
		act = new Actions(driver);
		act.dragAndDrop(src, target).perform();

	}

	/**
	 * this is a generic method to perform dragAPointer
	 * 
	 * @param src
	 * @param xOffset
	 * @param yOffset
	 */
	public void dragAPointer(WebDriver driver, WebElement src, int xOffset, int yOffset) {
		act = new Actions(driver);
		act.dragAndDropBy(src, xOffset, yOffset).perform();
	}

	/**
	 * this is a generic method to perform Scroll operation element
	 * 
	 * @param element
	 */

	public void scrollToElement(WebDriver driver, WebElement element) {
		act = new Actions(driver);
		act.scrollToElement(element).perform();

	}

	/**
	 * this is a generic method to move cursor to a particular element
	 * 
	 * @param element
	 */

	public void moveCursorToAnElement(WebDriver driver, WebElement element) {
		act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * this is a generic method to hold the element
	 * 
	 * @param element
	 */
	public void holdToElement(WebDriver driver, WebElement element) {
		act = new Actions(driver);
		act.clickAndHold(element).perform();
	}

	/**
	 * this is a generic method to release the element
	 * 
	 * @param element
	 */
	public void releseAnElement(WebDriver driver, WebElement element) {
		act = new Actions(driver);
		act.release(element).perform();
	}



	/*--------------------------Alert----------------------*/

	/**
	 * this is a generic method to accept the alert
	 * @throws Exception 
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * this is a generic method to dismiss the alert
	 */

	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	
	
	
	/*--------------------------Navigation----------------------*/
	public void navigateBack(WebDriver driver) {
		driver.navigate().back();
	}
}