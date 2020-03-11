package touchscreentest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TouchScreenTest {

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "charan");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability(AndroidMobileCapabilityType .APP_ACTIVITY, "TouchScreenTestActivity");
		//dc.setCapability("app", "E:\\chrome downloads\\ApiDemos-debug.apk");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		dc.setCapability(MobileCapabilityType.UDID, "e501c6d80903");
		dc.setCapability("noReset", true);
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		//driver.findElementById("jp.rallwell.siriuth.touchscreentest:id/surfaceView").click();
		
		Dimension size = driver.manage().window().getSize();
		int height=size.getHeight();
		int width=size.getWidth();
		int startx= (int) (width* 0.2);
		int starty= (int) (height*0.2);
		int endx=(int)(width*0.8);
		int endy=(int)(height*.8);
	driver.swipe(startx, starty, endx, endy, 500);
	//	driver.closeApp();

	}

}
