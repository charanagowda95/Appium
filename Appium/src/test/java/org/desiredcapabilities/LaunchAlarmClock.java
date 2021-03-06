package org.desiredcapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LaunchAlarmClock {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("deviceName", "charan");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion","7");
		dc.setCapability("appPackage", "com.android.deskclock");
		dc.setCapability("appActivity", "com.android.alarmclock.AlarmClock");
		dc.setCapability("automationName", "appium");
		dc.setCapability("UDID", "e501c6d80903");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);

	}

}
