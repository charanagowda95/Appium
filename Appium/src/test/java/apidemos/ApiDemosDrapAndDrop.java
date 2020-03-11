package apidemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosDrapAndDrop {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "charan");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		dc.setCapability(AndroidMobileCapabilityType .APP_ACTIVITY, "ApiDemos");
		//dc.setCapability("app", "E:\\chrome downloads\\ApiDemos-debug.apk");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		dc.setCapability(MobileCapabilityType.UDID, "e501c6d80903");
		dc.setCapability("noReset", true);
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		WebElement views = driver.findElementByAccessibilityId("Views");
		driver.tap(1, views, 500);
		WebElement DragAndDrop = driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']");
		driver.tap(1, DragAndDrop, 500);
		WebElement src = driver.findElementByXPath("//android.view.View[@resource-id='io.appium.android.apis:id/drag_dot_1']");
		WebElement des = driver.findElementByXPath("//android.view.View[@resource-id='io.appium.android.apis:id/drag_dot_2']");
		TouchAction ta=new TouchAction(driver);
		ta.press(src).waitAction(2000).moveTo(des).release().perform();
		driver.closeApp();
	
	
	}

	
}
