package PageFactoryPackage;

import java.sql.Driver;
import org.openqa.selenium.devtools.v121.page.Page;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class ActualCode extends BrowserLaunch {

	// TODO Auto-generated constructor stub
	@Test
	public static void login() throws InterruptedException {
		PageElements page = new PageElements(driver);
		page.timeout();
		page.setname("sanjai");
		page.setgender("Male");
		page.setcountryName("Argentina");
		page.submitform();
		page.addtocart(0);
		page.addtocart(1);
	}

}
