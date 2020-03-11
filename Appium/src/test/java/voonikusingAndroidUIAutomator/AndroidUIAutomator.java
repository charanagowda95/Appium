package voonikusingAndroidUIAutomator;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidUIAutomator {
	@Test
	public static void voonik() throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "charan");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.mrvoonik.android");
		dc.setCapability(AndroidMobileCapabilityType .APP_ACTIVITY, "splashsection.Splash");
		//dc.setCapability("app", "E:\\chrome downloads\\ApiDemos-debug.apk");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		dc.setCapability(MobileCapabilityType.UDID, "e501c6d80903");
		dc.setCapability("noReset", true);
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement categories = driver.findElementByAndroidUIAutomator("text(\"CATEGORIES\")");
		driver.tap(1, categories, 200);
		WebElement selectCategory = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"MEN CASUAL SHOES\"))");
		driver.tap(1, selectCategory, 200);
		WebElement selectItem = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Men's Red and Black casual shoes\"))");
		driver.tap(1, selectItem, 200);
		String selected= driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Men's Red and Black casual shoes\"))").getText();
		System.out.println(selected);
		WebElement wishlist = driver.findElementByAndroidUIAutomator("text(\"Wishlist\")");
		driver.tap(1, wishlist, 200);
		//WebElement back = driver.findElementByAccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎");
		//driver.tap(1, back, 200);
		driver.navigate().back();
		driver.navigate().back();
		WebElement handBurger = driver.findElementByXPath("//android.widget.ImageButton[@package='com.mrvoonik.android']");
		driver.tap(1, handBurger, 500);
		WebElement my_wishlist = driver.findElementByAndroidUIAutomator("text(\"MY WISHLIST\")");
		driver.tap(1, my_wishlist, 200);
		String displayed = driver.findElementByAndroidUIAutomator("text(\"Men's Red and Black casual shoes\")").getText();
		//System.out.println(displayed);
		//System.out.println(selected.equals(displayed));
		Assert.assertEquals(selected, displayed);
		driver.closeApp();	
	
	
	}

}
