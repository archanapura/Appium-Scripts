package phoneRelated;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class OrientationRelated {
	 public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
		// driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='2']")).click();
		System.out.println(driver.getOrientation());
		driver.rotate(ScreenOrientation.LANDSCAPE);
		System.out.println(driver.getOrientation());
		Thread.sleep(2000);
		 driver.closeApp();
	 }
}
