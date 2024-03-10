package todos.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import todos.utils.BasePage;

public class TodoPage2 extends BasePage {

	public TodoPage2() throws IOException, InterruptedException {
		Thread.sleep(20000);
	}

	final static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	/* Locators */
	final static String INPUT_ID = "Email";

	/* @FindBy */
	@FindBy(how = How.ID, using = INPUT_ID)
	public static WebElement inputText;

	/* Methods */
	public void submitTodo(String todo) {
		PageFactory.initElements(driver, this);
    	wait.until(ExpectedConditions.visibilityOf(inputText));
		inputText.sendKeys(todo);
		
	}

}