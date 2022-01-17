import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {
    @Test
    public static void TestMethod1() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.APP,"/Users/vishnuvardhank/Documents/ImportantFiles/ApiDemos-debug.apk");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"pixel_xl");
        caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url,caps);

        MobileElement accessibility1 = (MobileElement) driver.findElementByAccessibilityId("Accessibility");
//        accessibility1.click();

        //By accessibility1 = MobileBy.AccessibilityId("Accessibility");
        //driver.findElement(accessibility1).click();
        TouchAction action = new TouchAction(driver);
        action.tap(TapOptions.tapOptions().withElement(ElementOption.element(accessibility1))).perform();

    }
}
