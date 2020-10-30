//package <set your test package>;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class Scenario2 {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Scenario2";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "59d0640b");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.shopee.my");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.shopee.app.ui.home.HomeActivity_");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testScenario2() {
        driver.findElement(By.xpath("//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Saya']]")).click();
        driver.findElement(By.xpath("(//*[@class='android.widget.FrameLayout' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@class='androidx.viewpager.widget.ViewPager']]]]/*/*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup']])[2]")).click();
        driver.findElement(By.xpath("//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Saya']]")).click();
        driver.findElement(By.xpath("//*[@text='Log Masuk']")).click();
        driver.findElement(By.xpath("//*[@id='cret_edit_text' and ./parent::*[@id='edtLoginId']]")).sendKeys("1234@123");
        driver.findElement(By.xpath("//*[@id='cret_edit_text' and ./parent::*[@id='edtPassword']]")).sendKeys("aaaa");
        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}