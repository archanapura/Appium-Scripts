package phoneRelated;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
/*
 * This class describes about network connections how to get and set Eg: data ,wifi, airplane mode
 * 
 * */
public class NwConnection {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities des =new DesiredCapabilities();
		des.setCapability("deviceName", "Gionee S6s");
		//des.setCapability("udid", "PF7T5PKFP7QCF6WS");
		des.setCapability("platformName", "Android");
		des.setCapability("platformVersion", "7.0");
		des.setCapability("appPackage", "com.android.calculator2");
		des.setCapability("appActivity", "com.android.calculator2.Calculator");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,des);
		
		System.out.println(driver.getConnection().getBitMask());
	//driver.setConnection(ConnectionState.DATA_MASK);
		
		 ConnectionStateBuilder b1 =new ConnectionStateBuilder();
		 b1.withDataEnabled();
		 
		 ConnectionState state=new ConnectionState(4);
		 System.out.println(state.getBitMask());
		 System.out.println(state.isDataEnabled());
		 System.out.println(state.isWiFiEnabled());
		


	}

}
