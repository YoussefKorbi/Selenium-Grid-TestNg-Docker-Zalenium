package todos.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import todos.utils.BasePage;

public class TodoPage extends BasePage {

	public TodoPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	/* Locators */
	final static String INPUT_TEXT = "//input[@placeholder='What needs to be done?']";

	/* @FindBy */
	@FindBy(how = How.XPATH, using = INPUT_TEXT)
	public static WebElement inputText;


	/* Methods */
	public void submitTodo(String todo) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(inputText));
		inputText.sendKeys(todo);
		inputText.sendKeys(Keys.ENTER);
	}

}