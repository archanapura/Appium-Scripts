package webapp;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class WebApp {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities des =new DesiredCapabilities();
		des.setCapability("deviceName", "Gionee S6s");
		//des.setCapability("udid", "PF7T5PKFP7QCF6WS");
		des.setCapability("platformName", "Android");
		des.setCapability("platformVersion", "7.0");
		des.setCapability("browserName", "Chrome");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,des);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.google.co.in/");
        
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("hello");
        driver.quit();
	}

}
