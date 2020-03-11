package org.desiredcapabilities;

import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TapSwipe {
	
	public class LaunchMobApp2 {

	public static void main(String[] args) throws MalformedURLException 
		{
			DesiredCapabilities dc= new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");
			dc.setCapability("app", "C:\\Users\\hp\\Downloads\\ApiDemos-debug.apk");
			dc.setCapability("noReset", true);
			dc.setCapability(MobileCapabilityType.UDID, "112e6c4a");

			URL url= new URL("http://localhost:4723/wd/hub");
			AndroidDriver driver= new AndroidDriver(url,dc);
			WebElement elem = driver.findElementByAccessibilityId("Graphics");
			driver.tap(1, elem, 500);
			Dimension size=driver.manage().window().getSize();
			
			driver.swipe(800, 1700, 900, 340, 500);
			
			//WebElement elem2 = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
			//driver.tap(1, elem2, 500);
			
		}

	}


}
