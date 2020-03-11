package koovs.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApp {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "charan");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.koovs.fashion");
		dc.setCapability(AndroidMobileCapabilityType .APP_ACTIVITY, "activity.SplashScreen");
		//dc.setCapability(MobileCapabilityType.APP, "E:\\chrome downloads\\ApiDemos-debug.apk");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		dc.setCapability(MobileCapabilityType.UDID, "e501c6d80903");
		dc.setCapability("noReset", true);
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement HandBurger = driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.koovs.fashion:id/iv_drawer']");
		driver.tap(1, HandBurger, 200);
		WebElement MenCatg = driver.findElementByAndroidUIAutomator("text(\"Men\")");
		driver.tap(1, MenCatg, 200);
		WebElement Products = driver.findElementByAndroidUIAutomator("text(\"PRODUCTS\")");
		driver.tap(1, Products, 200);
		WebElement Shirts = driver.findElementByAndroidUIAutomator("text(\"Shirts\")");
		WebElement  = driver.findElementByAndroidUIAutomator("text(\"PRODUCTS\")");
	}

}
