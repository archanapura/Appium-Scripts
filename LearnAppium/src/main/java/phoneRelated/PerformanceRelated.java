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

public class PerformanceRelated {
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
		 List<String> performanceTypes = driver.getSupportedPerformanceDataTypes();
		 System.out.println(performanceTypes);
		System.out.println(performanceTypes.get(0));
		System.out.println(performanceTypes.get(1));
		System.out.println(performanceTypes.get(2));
		System.out.println(performanceTypes.get(3));
		List<List<Object>> pValues=driver.getPerformanceData("com.android.calculator2","memoryinfo",10344);
		System.out.println(pValues);
		 
	 }
}
