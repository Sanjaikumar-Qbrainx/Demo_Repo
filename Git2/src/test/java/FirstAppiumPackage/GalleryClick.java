package FirstAppiumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class GalleryClick extends FirstAppium {
	
	@Test
	public static void gallery() {
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
      // WebElement firststep=driver.findElement(AppiumBy.xpath("//android.widget.ImageView)[1]"));
       WebElement firststep = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]"));

      Assert.assertEquals(driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");
     ((JavascriptExecutor) driver ).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",((RemoteWebElement) firststep).getId(),
    		 "direction","left",
    		 "percent",0.75));
     Assert.assertEquals(driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"false");

	}
	

}
