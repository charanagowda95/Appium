package draganddrop;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Drag_Drop_Action {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "charan");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.mobeta.android.demodslv");
		dc.setCapability(AndroidMobileCapabilityType .APP_ACTIVITY, "Launcher");
		//dc.setCapability("app", "E:\\chrome downloads\\DragAndDrop.apk");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		dc.setCapability(MobileCapabilityType.UDID, "e501c6d80903");
		dc.setCapability("noReset", true);
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement menu = driver.findElementByXPath("android.widget.TextView[@text='Basic usage playground']");
	WebElement src = driver.findElementByXPath("(android.widget.ImageView[@resource-id='com.mobeta.android.demodslv:id/drag_handle'])[1]");
	WebElement des = driver.findElementByXPath("(android.widget.ImageView[@resource-id='com.mobeta.android.demodslv:id/drag_handle'])[4]");
	TouchAction ta=new TouchAction(driver);
	ta.press(src).waitAction(500).moveTo(des).release().perform();
	}

}
