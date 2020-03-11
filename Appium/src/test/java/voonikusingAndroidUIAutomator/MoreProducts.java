package voonikusingAndroidUIAutomator;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class MoreProducts {
	@Test
	public static void voonik() throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "charan");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.mrvoonik.android");
		dc.setCapability(AndroidMobileCapabilityType .APP_ACTIVITY, "splashsection.Splash");
		//dc.setCapability(MobileCapabilityType.APP, "E:\\chrome downloads\\ApiDemos-debug.apk");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		dc.setCapability(MobileCapabilityType.UDID, "e501c6d80903");
		dc.setCapability("noReset", true);
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ArrayList<String> beforeAdding=new ArrayList<String>();
		ArrayList<String> afterAdding=new ArrayList<String>();
		
		
		
		WebElement categories = driver.findElementByAndroidUIAutomator("text(\"CATEGORIES\")");
		driver.tap(1, categories, 200);
		WebElement selectCategory = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"MEN CASUAL SHOES\"))");
		driver.tap(1, selectCategory, 200);
		
		
		WebElement selectItem1= driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Men's Red and Black casual shoes\"))");
		driver.tap(1, selectItem1, 200);
		String selected1= driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Men's Red and Black casual shoes\"))").getText();
		WebElement wishlist1 = driver.findElementByAndroidUIAutomator("text(\"Wishlist\")");
		driver.tap(1, wishlist1, 200);
		driver.navigate().back();
		
		WebElement selectItem2 = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Men's White and Green casual shoes\"))");
		driver.tap(1, selectItem2, 200);
		String selected2= driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Men's White and Green casual shoes\"))").getText();
		WebElement wishlist2 = driver.findElementByAndroidUIAutomator("text(\"Wishlist\")");
		driver.tap(1, wishlist2, 200);
		driver.navigate().back();
		
		
		
		WebElement selectItem3 = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Premium Beige Comfort Sneakers for Men\"))");
		driver.tap(1, selectItem3, 200);
		String selected3= driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Premium Beige Comfort Sneakers for Men\"))").getText();
		WebElement wishlist3 = driver.findElementByAndroidUIAutomator("text(\"Wishlist\")");
		driver.tap(1, wishlist3, 200);
		
		
		
		
		//WebElement back = driver.findElementByAccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎");
		//driver.tap(1, back, 200);
		driver.navigate().back();
		driver.navigate().back();
		WebElement handBurger = driver.findElementByXPath("//android.widget.ImageButton[@package='com.mrvoonik.android']");
		driver.tap(1, handBurger, 500);
		WebElement my_wishlist = driver.findElementByAndroidUIAutomator("text(\"MY WISHLIST\")");
		driver.tap(1, my_wishlist, 200);
		
		
		String displayed1 = driver.findElementByAndroidUIAutomator("text(\"Men's Red and Black casual shoes\")").getText();
		String displayed2 = driver.findElementByAndroidUIAutomator("text(\"Men's White and Green casual shoes\")").getText();
		String displayed3 = driver.findElementByAndroidUIAutomator("text(\"Premium Beige Comfort Sneakers for Men\")").getText();
		
		
		beforeAdding.add(selected1);
		beforeAdding.add(selected2);
		beforeAdding.add(selected3);
		
		afterAdding.add(displayed1);
		afterAdding.add(displayed2);
		afterAdding.add(displayed3);
		
		Assert.assertEquals(beforeAdding., afterAdding);
		//System.out.println(displayed);
		//System.out.println(selected.equals(displayed));
		//Assert.assertEquals(selected, displayed);
		driver.closeApp();	
	
	
	}

}
