//package <set your test package>;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.SwipeElementDirection;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class Untitled {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "59d0640b");
        dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Luqman afif\\AppData\\Roaming\\appiumstudio\\original-apks\\com.shopee.mycom.shopee.app.ui.home.HomeActivity_.2.apk");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.shopee.my");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.shopee.app.ui.home.HomeActivity_");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testUntitled() {
        driver.findElement(By.xpath("//*[@text='Suapan']")).click();
        driver.swipe(296, 800, 296, 100, 925);
        driver.swipe(296, 800, 296, 240, 997);
        driver.swipe(296, 800, 296, 660, 587);
        driver.swipe(296, 800, 296, 520, 811);
        driver.swipe(296, 800, 296, 380, 659);
        driver.swipe(296, 800, 296, 520, 655);
        driver.swipe(296, 1360, 296, 2200, 719);
        driver.swipe(296, 1360, 296, 2200, 769);
        driver.findElement(By.xpath("//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Shopee Mall']]")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='android.widget.FrameLayout' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@class='androidx.viewpager.widget.ViewPager']]]]/*/*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup']])[3]")));
        driver.findElement(By.xpath("(//*[@class='android.widget.FrameLayout' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@class='androidx.viewpager.widget.ViewPager']]]]/*/*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup']])[3]")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}