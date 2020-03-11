package handlenotification;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ClickOnnotification {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "charan");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bhanu.notificationreminders");
		dc.setCapability(AndroidMobileCapabilityType .APP_ACTIVITY, "MainDrawerActivity");
		//dc.setCapability("app", "E:\\chrome downloads\\ApiDemos-debug.apk");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		dc.setCapability(MobileCapabilityType.UDID, "e501c6d80903");
		//dc.setCapability("noReset", true);
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		driver.findElementByXPath("//android.widget.EditText[@resource-id='com.bhanu.notificationreminders:id/txtNewNoteTitle']").sendKeys("charan");
		driver.findElementByXPath("//android.widget.Button[@resource-id='com.bhanu.notificationreminders:id/btnNotify']").click();
		
		driver.openNotifications();
		//driver.findElementByAccessibilityId("Read").click();
		driver.findElementByXPath("(//android.widget.LinearLayout[@resource-id='android:id/notification_main_column'])[1]").click();
	}

}
