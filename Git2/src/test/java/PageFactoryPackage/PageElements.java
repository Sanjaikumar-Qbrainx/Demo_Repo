package PageFactoryPackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageElements extends AndroidActions {
	AndroidDriver driver;

	public PageElements(AndroidDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.androidsample.generalstore:id/nameField']")
	private WebElement username;

	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Male']")
	private WebElement maleOption; 

	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Female']")
	private WebElement femaleOption; 

	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private WebElement countrySelection;

	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.androidsample.generalstore:id/btnLetsShop']")
	private WebElement letshopButton;

	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")
	private List<WebElement> addItemToCart;



	///-------------------------------------------Actual-Methods-----------------------------------------------------///
	public void setname(String name) {
		username.sendKeys(name);
	}
	public void setgender(String name) {
		if(name.contains("Male")) {
			maleOption.click();}
		else {
			femaleOption.click();}
	}
	public void setcountryName(String countryname) {
		countrySelection.click();
		scrolltext(countryname);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='"+countryname+"']")).click();
	}
	public void submitform() {
		letshopButton.click();
	}
	public void addtocart(int index) throws InterruptedException {
		addItemToCart.get(index).click();

	}
}
