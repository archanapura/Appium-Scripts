package phoneRelated;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidBatteryInfo;
import io.appium.java_client.android.AndroidDriver;

public class BatteryRelated {
	public static void main(String[] args) throws MalformedURLException {
		 DesiredCapabilities des =new DesiredCapabilities();
		 des.setCapability("deviceName", "emulator-5554");
		 //des.setCapability("udid", "PF7T5PKFP7QCF6WS");
		 des.setCapability("platformName", "Android");
		 des.setCapability("platformVersion", "8.1");
		 des.setCapability("appPackage", "com.android.calculator2");
		 des.setCapability("appActivity", "com.android.calculator2.Calculator");
		 des.setCapability("automationName", "UiAutomator2");
		 URL url=new URL("http://127.0.0.1:4723/wd/hub");
		 
		 AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url,des);

		AndroidBatteryInfo ifb= driver.getBatteryInfo();
		 System.out.println(ifb.getState());
		 System.out.println(ifb.getLevel());
			
 
	 }
}
