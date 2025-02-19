package objectRepository2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class HomePage {
	@FindBy(xpath = "//div[@class='css-sukebr']")
	private WebElement orderDash;

	@FindBy(xpath = "//span[text()='Orders']")
	private WebElement orders;

	@FindBy(xpath = "//button[text()='Add Bulk Orders']")
	private WebElement addBulkOrders;

	@FindBy(xpath = "//div[contains(@class, 'MuiAvatar-root')]")
	private WebElement profile;

	@FindBy(xpath = "//span[text()=' Logout ']")
	private WebElement logoutOption;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrderDash() {
		return orderDash;
	}

	public WebElement getOrders() {
		return orders;
	}

	public WebElement getAddBulkOrders() {
		return addBulkOrders;
	}

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLogoutOption() {
		return logoutOption;
	}

	public void clickonOrderDash() {
		orderDash.click();
	}

	public void clickonAddBulkOrders() {
		addBulkOrders.click();
	}

	public void clickonOrder() {
		orders.click();
	}

	public void logoutOperation(WebDriver driver) throws Exception {
		SeleniumUtility SUTIL = new SeleniumUtility();
		SUTIL.clickOnAnElement(driver, profile);
		Thread.sleep(2500);
		SUTIL.clickOnAnElement(driver, logoutOption);
	}
}


