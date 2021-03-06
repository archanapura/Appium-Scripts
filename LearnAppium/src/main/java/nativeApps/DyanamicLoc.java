package nativeApps;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class DyanamicLoc {
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
		MobileElement ele=driver.findElement(By.id("com.android.mms:id/embedded_text_editor"));
		Dimension elementSize = ele.getSize();
		System.out.println(elementSize.height);
		System.out.println(elementSize.width);
		System.out.println(ele.getLocation());
		System.out.println(ele.getLocation().x);
		System.out.println(ele.getLocation().y);
	TouchAction t=new TouchAction(driver);
	//t.tap(new PointOption().point(263, 1444)).perform();
	
	}
}
