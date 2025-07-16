package FirstAppiumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.KeyEvent;

public class FirstMobileBrowser extends Mobile_FirstSetup {
	
	@Test
	public static void automatechrome() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//Thread.sleep(5000);
		driver.get("http://google.com");
		//Thread.sleep(5000);

		driver.findElement(By.name("q")).sendKeys("amazon");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
}
