package PageFactoryPackage;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BrowserLaunch {
	static AndroidDriver driver;
	static AppiumDriverLocalService service;
	
	
	@BeforeTest
	public void one() throws MalformedURLException, URISyntaxException, InterruptedException {
		//		service = new AppiumServiceBuilder().withAppiumJS(new java.io.File("C:/Users/sanjaikumar/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
		//				.withIPAddress("127.0.0.1").usingPort(4723).build();
		//		service.start();
		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("Pixel7");
		option.setApp("C://Users//sanjaikumar//Downloads//General-Store.apk");
		driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),option);
	}
}