package FirstAppiumPackage;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class FirstAppium { 
	static AndroidDriver driver;
	static AppiumDriverLocalService service;
	

	@BeforeTest
	public void one() throws MalformedURLException, URISyntaxException, InterruptedException {
//		service = new AppiumServiceBuilder().withAppiumJS(new java.io.File("C:/Users/sanjaikumar/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();
		UiAutomator2Options option = new UiAutomator2Options();
	 	option.setDeviceName("Pixel7");
		//[option.setApp("C://Users//sanjaikumar//APKFiles//resources//ApiDemos-debug.apk");
		option.setApp("C://Users//sanjaikumar//Downloads//General-Store.apk");
		driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),option);
		//option.setChromedriverExecutable("C://Users//sanjaikumar//Driver");
		//option.setCapability("browserName", "Chrome");
//		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\'3. Preference dependencies\']")).click();
//		driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"android:id/checkbox\"]")).click();
//		driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[2]")).click();
//		driver.findElement(By.id("android:id/edit")).sendKeys("SANJAI");
//		driver.findElement(By.id("android:id/button1")).click();
//		

		//driver.quit();

	}

}
