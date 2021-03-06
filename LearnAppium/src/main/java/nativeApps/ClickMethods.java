package nativeApps;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;
/*
 * This class just describe how to launch calculator and add
 * */
public class ClickMethods {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities des =new DesiredCapabilities();
		des.setCapability("deviceName", "Gionee S6s");
		//des.setCapability("udid", "PF7T5PKFP7QCF6WS");
		des.setCapability("platformName", "Android");
		des.setCapability("platformVersion", "7.0");
		des.setCapability("appPackage", "com.android.calculator2");
		des.setCapability("appActivity", "com.android.calculator2.Calculator");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url,des);
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='2']")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='plus']")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='5']")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='equal']")).click();
		driver.closeApp();
	}
}
