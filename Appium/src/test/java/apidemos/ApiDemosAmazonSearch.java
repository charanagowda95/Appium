package apidemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosAmazonSearch {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "charan");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "in.amazon.mShop.android.shopping");
		dc.setCapability(AndroidMobileCapabilityType .APP_ACTIVITY, "com.amazon.mShop.android.home.HomeActivity");
		//dc.setCapability("app", "E:\\chrome downloads\\ApiDemos-debug.apk");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		dc.setCapability(MobileCapabilityType.UDID, "e501c6d80903");
		dc.setCapability("noReset", true);
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		driver.findElementByXPath("//android.widget.EditText[@text='Search']").sendKeys("redmi note 8");
		// For pressing Enter key we have to call pressKeyCode
		driver.pressKeyCode(AndroidKeyCode.ENTER);
	}

}
