package hybridApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class LoginApp {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities des =new DesiredCapabilities();
		des.setCapability("deviceName", "Gionee S6s");
		//des.setCapability("udid", "PF7T5PKFP7QCF6WS");
		des.setCapability("platformName", "Android");
		des.setCapability("platformVersion", "7.0");
		des.setCapability("appPackage", "com.androidsample.generalstore");
		des.setCapability("appActivity", "com.androidsample.generalstore.SplashActivity");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,des);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Congo\"))");
		//driver.findElement(By.xpath("//*[@text='Congo']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");;
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))");
		driver.findElement(By.xpath("(//*[@text='ADD TO CART'])[2]")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		//System.out.println(driver.getContext());


		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(7000);
		//System.out.println(driver.getContext());
		Set<String> val=driver.getContextHandles();
		System.out.println(val.size());
		//System.out.println(val);
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("hello");
		
		driver.quit();

	}
}
