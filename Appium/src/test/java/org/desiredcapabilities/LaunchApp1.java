package org.desiredcapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LaunchApp1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("deviceName", "charan");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion","7");
		dc.setCapability("appPackage", "com.miui.calculator");
		dc.setCapability("appActivity", "cal.AllInOneCalculatorActivity");
		dc.setCapability("automationName", "appium");
		dc.setCapability("UDID", "e501c6d80903");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		

	}

}
