package todos.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import todos.utils.BasePage;

public class NopCommerceAcceuil extends BasePage {

	public NopCommerceAcceuil() throws IOException, InterruptedException {
		
		PageFactory.initElements(driver, this);

	}

	/* Locators */
	final static String DASHBOARD_XPATH = "//h1[contains(text(),'Dashboard')]";

	/* @FindBy */

	@FindBy(how = How.XPATH, using = DASHBOARD_XPATH)
	public static WebElement dashboardBtn;

	/* Methods */
	public void isDashboardDiplayed() {

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOf(dashboardBtn));

		// Assert that the element is displayed
		Assert.assertTrue(dashboardBtn.isDisplayed(), "Element is not displayed on the page");

	}

}
