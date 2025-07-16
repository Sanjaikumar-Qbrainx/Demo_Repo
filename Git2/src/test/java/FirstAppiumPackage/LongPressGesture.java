//package FirstAppiumPackage;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//import com.google.common.collect.ImmutableMap;
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.touch.LongPressOptions;
//
//class LongPressGesture extends  {
//	
//	@Test
//	public void longpress() throws InterruptedException {
//
//
//		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
//		//driver.findElement(AppiumBy.accessibilityId("Views")).click();
//		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
//		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement web=	driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));      
//		((JavascriptExecutor)driver).executeScript("mobile", "longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)web).getId(),"duration",4000));
//		Thread.sleep(7000);
//
//	}
//}
