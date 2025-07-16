package CDP;

import java.util.Optional;

import javax.sound.midi.MidiDeviceTransmitter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v121.emulation.Emulation;

import dev.failsafe.Execution;

public class Cdp_Tool {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver  = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		devTools.send(Emulation.setDeviceMetricsOverride(414, 896, 47, true, Optional.empty(),Optional.empty(),
				Optional.empty(),Optional.empty(),Optional.empty(),
				Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty()));

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		driver.findElement(By.linkText("Library")).click();


	}

}
