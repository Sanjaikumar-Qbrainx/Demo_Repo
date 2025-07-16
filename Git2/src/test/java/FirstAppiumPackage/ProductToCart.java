package FirstAppiumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ProductToCart extends Ecommerce_TC_001 {
    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    @Test
    public static void cart() {
        driver.findElements(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
//        int productcount = driver.findElements(AppiumBy.xpath("com.androidsample.generalstore:id/productName")).size();
//        for (int i = 0; i<productcount; i++) {
           String productname = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
          if (productname.equalsIgnoreCase("Jordan 6 Rings")) {
                WebElement time = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart'])[1]"));
                wait.until(ExpectedConditions.visibilityOf(time)).click();
                driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
              //String lastpageproduct=  driver.findElement(By.xpath("com.androidsample.generalstore:id/productName")).getText();
              Assert.assertEquals(productname, "Jordan 6 Rings");
            }

    }    }

