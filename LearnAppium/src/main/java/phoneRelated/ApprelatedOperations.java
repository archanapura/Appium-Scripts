package phoneRelated;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidBatteryInfo;
import io.appium.java_client.android.AndroidDriver;

public class ApprelatedOperations {
	 public static void main(String[] args) throws MalformedURLException {
		 DesiredCapabilities des =new DesiredCapabilities();
		 des.setCapability("deviceName", "emulator-5554");
		 des.setCapability("platformName", "Android");
		 des.setCapability("platformVersion", "8.1");
		 des.setCapability("appPackage", "com.android.calculator2");
		 des.setCapability("appActivity", "com.android.calculator2.Calculator");
		 des.setCapability("automationName", "UiAutomator2");
		 URL url=new URL("http://127.0.0.1:4723/wd/hub");
		 
		 
		 AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url,des);
		// driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='2']")).click();
		 driver.startActivity(new Activity("com.android.deskclock", "com.android.deskclock.AlarmClock"));
		 driver.launchApp();
		 driver.resetApp();
		 //driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='plus']")).click();
		 driver.closeApp();
	 }
}
