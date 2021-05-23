package nativeApps;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.LogsEvents;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.serverevents.CustomEvent;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class TapMethods {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities des =new DesiredCapabilities();
		des.setCapability("deviceName", "Gionee S6s");
		//des.setCapability("udid", "PF7T5PKFP7QCF6WS");
		des.setCapability("platformName", "Android");
		des.setCapability("platformVersion", "7.0");
		des.setCapability("appPackage", "com.android.mms");
		des.setCapability("appActivity", "com.android.mms.ui.ComposeMessageActivity");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url,des);
		
		
	TouchAction t=new TouchAction(driver);
	t.tap(new PointOption().point(263, 1444)).perform();
	MobileElement ele=driver.findElement(By.id("com.android.mms:id/embedded_text_editor"));
	t.tap(new TapOptions().withElement(new ElementOption().element(ele))).perform();
	}
}
