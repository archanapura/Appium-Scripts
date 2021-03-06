package nativeApps;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class MultiTouchClass {
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
		driver.findElementByAccessibilityId("Buttons").click();
		MobileElement src=driver.findElementByAccessibilityId("Normal");
		MobileElement dst=driver.findElementByAccessibilityId("Toggle");
		TouchAction t1=new TouchAction(driver);
		t1.tap(new TapOptions().withElement(ElementOption.element(src)));
		TouchAction t2=new TouchAction(driver);
		t2.tap(new TapOptions().withElement(ElementOption.element(dst)));
	MultiTouchAction at=new MultiTouchAction(driver);
	at.add(t1).add(t2).perform();
			
		
	
	//MobileElement validate=driver.findElement(By.xpath("//*[@text='Sample menu']"));
	//System.out.println(validate.isDisplayed());
	}
}
