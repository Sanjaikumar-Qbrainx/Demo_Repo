package FirstAppiumPackage;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public	 class TwoProductToCart extends Ecommerce_TC_001 {
	@Test
	public static void twoproduct() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart'])[1]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart'])[2]")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(2000);
		List<WebElement> productprice= driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productPrice"));
		int count =productprice.size();
		double totalsum =0;
		for(int i=0; i<count; i++) {
			String amountstring=productprice.get(i).getText();
			Double price= Double.parseDouble(amountstring.substring(1));
			totalsum = totalsum+price;
		}
		String Finalprice=driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		Double Totalvalue=Double.parseDouble(Finalprice.substring(1));
		Assert.assertEquals(totalsum, Totalvalue);
		Thread.sleep(3000);
		WebElement web=	driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));      
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)web).getId(),"duration",2000));
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(3000);
		Set<String> contexts=driver.getContextHandles();
		for(String contextname:contexts) {
			System.out.println(contextname);
		}
		driver.context("WEBVIEW_com.androidsample.generalstore");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("flipkart");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);



	}


}
