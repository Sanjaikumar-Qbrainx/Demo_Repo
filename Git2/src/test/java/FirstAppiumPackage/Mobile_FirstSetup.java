package FirstAppiumPackage;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Mobile_FirstSetup  {

	static AndroidDriver driver;
	static AppiumDriverLocalService service;
	@Test
	public static void browserlaunch() throws MalformedURLException, URISyntaxException {
		//		service = new AppiumServiceBuilder().withAppiumJS(new java.io.File("C:/Users/sanjaikumar/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
		//				.withIPAddress("127.0.0.1").usingPort(4723).build();
		//		service.start();       
		//DesiredCapabilities capabilities = new DesiredCapabilities();

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel6a");
		options.setPlatformName("Android");
		options.setCapability("browserName", "Chrome");
		// capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300); // Example: 5 minutes (300 seconds)
		options.setCapability("newCommandTimeout", 6000);
		options.setChromedriverExecutable("C://Users//sanjaikumar//Driver//chromedriver.exe");
		driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),options);
	}

}
