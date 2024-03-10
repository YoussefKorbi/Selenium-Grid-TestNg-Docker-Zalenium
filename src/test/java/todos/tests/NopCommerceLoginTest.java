package todos.tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import todos.pages.NopCommerceAcceuil;
import todos.pages.NopCommerceLoginPage;
import todos.pages.TodoPage;
import todos.utils.Setup;

public class NopCommerceLoginTest extends Setup {

	public NopCommerceLoginTest() throws IOException, InterruptedException {
		super();
	}

	NopCommerceLoginPage nopCommerceLoginPage;

	@Test()
	public void SeConnecter() throws InterruptedException, IOException {
		nopCommerceLoginPage = new NopCommerceLoginPage();
		nopCommerceLoginPage.setEmail(prop.getProperty("Email1"), prop.getProperty("pwd"));
		nopCommerceLoginPage.isConnectedSuccefylly();
	}
}
