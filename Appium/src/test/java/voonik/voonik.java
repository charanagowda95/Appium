package voonik;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class voonik {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
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
		Thread.sleep(2000);
		 WebElement handBurger = driver.findElementByXPath("//android.widget.ImageButton[@package='com.mrvoonik.android']");
		driver.tap(1, handBurger, 500);
		 Thread.sleep(2000);
		WebElement T_shirts = driver.findElementByXPath("//android.widget.TextView[@text='T-shirts']");
		driver.tap(1, T_shirts, 500);
		Thread.sleep(2000);
		WebElement t_shirt = driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.mrvoonik.android:id/MageNative_image']");
		driver.tap(1, t_shirt, 500);
		Dimension size = driver.manage().window().getSize();
		int height=size.getHeight();
		int width=size.getWidth();
		int startx= (int) (width/2);
		int starty= (int) (height*0.8);
		int endx=(int)(width/2);
		int endy=(int)(height*0.5);
		Thread.sleep(2000);
	driver.swipe(startx, starty, endx, endy, 500);
		String act = driver.findElementByXPath("//android.widget.TextView[@text='Black Full Sleeve Hooded T-Shirt']").getText();
		WebElement t_shirt_size = driver.findElementByXPath("//android.widget.TextView[@text='Size : M']");
		driver.tap(1, t_shirt_size, 500);
	driver.swipe(startx, starty, endx, endy, 500);
	
	WebElement addToCart = driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
	driver.tap(1, addToCart, 500);
	WebElement cart = driver.findElementByXPath("//android.widget.FrameLayout[@resource-id='com.mrvoonik.android:id/MageNative_action_cart']");
	driver.tap(1,cart, 500);
	Thread.sleep(3000);
		String exp=driver.findElementByXPath("//android.widget.TextView[@text='Black Full Sleeve Hooded T-Shirt']").getText();
System.out.println(act.equals(exp));
	}

}
