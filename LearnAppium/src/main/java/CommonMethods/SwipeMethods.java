package CommonMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class SwipeMethods {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities des =new DesiredCapabilities();
		des.setCapability("deviceName", "Gionee S6s");
		//des.setCapability("udid", "PF7T5PKFP7QCF6WS");
		des.setCapability("platformName", "Android");
		des.setCapability("platformVersion", "7.0");
		des.setCapability("appPackage", "io.appium.android.apis");
		des.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url,des);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		driver.findElementByAccessibilityId("Date Widgets").click();
		driver.findElementByAccessibilityId("2. Inline").click();
		driver.findElementByAccessibilityId("3").click();
		MobileElement src=driver.findElementByAccessibilityId("15");
		MobileElement dst=driver.findElementByAccessibilityId("45");
		
	TouchAction t=new TouchAction(driver);
	t.longPress(new LongPressOptions().withElement(ElementOption.element(src))
			.withDuration(Duration.ofSeconds(1)))
	.moveTo(ElementOption.element(dst))
	.release().perform();
	
			
		
	
	//MobileElement validate=driver.findElement(By.xpath("//*[@text='Sample menu']"));
	//System.out.println(validate.isDisplayed());
	}
}
