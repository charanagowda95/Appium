package org.desiredcapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class StopWatchCompareTime {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "charan");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.deskclock");
		dc.setCapability(AndroidMobileCapabilityType .APP_ACTIVITY, "AlarmClock");
		//dc.setCapability("app", "E:\\chrome downloads\\ApiDemos-debug.apk");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		dc.setCapability(MobileCapabilityType.UDID, "e501c6d80903");
		dc.setCapability("noReset", true);
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		
		driver.findElementByXPath("//android.widget.TextView[@resource-id='com.android.deskclock:id/stopwatch']").click();
		
		String start=driver.findElementByXPath("//android.widget.TextView[@resource-id='com.android.deskclock:id/time']").getText();
		System.out.println(start);
		driver.findElementByXPath("//android.widget.ImageButton[@resource-id='com.android.deskclock:id/start_btn']").click();
		driver.runAppInBackground(10);
		Thread.sleep(15000);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Pause\"]").click();
		driver.findElementByXPath(")
		
		
		
		/*String start = driver.findElementByXPath("//android.widget.TextView[@resource-id='com.android.soundrecorder:id/txt_timer']").getText();
		driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.android.soundrecorder:id/btn_record']").click();
		driver.runAppInBackground(10);
		Thread.sleep(15000);
		driver.fin*/
		
		
	}

}
