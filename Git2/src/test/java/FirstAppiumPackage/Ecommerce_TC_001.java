package FirstAppiumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Ecommerce_TC_001  extends FirstAppium {
	@Test
	public static void fillForm() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		//Login 
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.androidsample.generalstore:id/nameField']")).sendKeys("sanjai");
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Male']")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='Argentina']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id='com.androidsample.generalstore:id/btnLetsShop']")).click();
		// Toast msg checking
		//String toastmessage = driver.findElement(AppiumBy.xpath("//android.widget.Toast)[1]")).getAttribute("name");
		// Assert.assertEquals(toastmessage, "Please enter your name");

		//Scrolling to select product------------------------
//		driver.findElements(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
//		int productcount=driver.findElements(AppiumBy.xpath("com.androidsample.generalstore:id/productName")).size();
//		for(int i=0;i<productcount;i++) {
//			String productname=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
//
//			//String productname=driver.findElements(AppiumBy.xpath("com.androidsample.generalstore:id/rvProductList")).get(i).getText();
//			if(productname.equalsIgnoreCase("Jordan 6 Rings")) {
//				//driver.findElement(AppiumBy.id("(com.androidsample.generalstore:id/productAddCart)[1]")).click();
//			WebElement time=	driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart'])[1]"));
//				wait.until(ExpectedConditions.visibilityOf(time)).click();
//				//driver.findElements(AppiumBy.xpath(("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart'])[2]"))).get(i).click();
//				//driver.findElements(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[2]")).get(i).click();
//
//			
//			driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		}
		


	}
