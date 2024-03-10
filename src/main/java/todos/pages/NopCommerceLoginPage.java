package todos.pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import todos.utils.BasePage;

public class NopCommerceLoginPage extends BasePage {

	public NopCommerceLoginPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}
	/* Locators */
	final static String INPUT_EMAIL_ID = "Email";
	final static String INPUT_PWD_ID = "Password";
	final static String LOGIN_BTN_XPATH = "//button[@type='submit']";
	final static String DASHBOARD_BTN_XPATH = "//h1[contains(text(),'Dashboard')]";
	final static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	/* @FindBy */
	@FindBy(how = How.ID, using = INPUT_EMAIL_ID)
	public static WebElement inputEmail;

	@FindBy(how = How.ID, using = INPUT_PWD_ID)
	public static WebElement inputPWD;

	@FindBy(how = How.XPATH, using = LOGIN_BTN_XPATH)
	public static WebElement loginBtn;

	@FindBy(how = How.XPATH, using = DASHBOARD_BTN_XPATH)
	public static WebElement dashboardTitle;
	
	/* Methods */
	public void setEmail(String TextMail, String TextPWD) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(inputEmail));
		inputEmail.clear();
		inputEmail.sendKeys(TextMail);
		wait.until(ExpectedConditions.visibilityOf(inputPWD));
		inputPWD.clear();
		inputPWD.sendKeys(TextPWD);
		wait.until(ExpectedConditions.visibilityOf(loginBtn));
		loginBtn.click();
	}

	public void isConnectedSuccefylly( ) {
		wait.until(ExpectedConditions.visibilityOf(dashboardTitle));
		Assert.assertTrue(dashboardTitle.isDisplayed(),"Is not displayed");
	}

}
