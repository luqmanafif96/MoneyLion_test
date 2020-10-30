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

public class Scenario1and2 {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Scenario1and2";
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
    public void testScenario1and2() {
        driver.findElement(By.xpath("(//*[@class='android.widget.FrameLayout' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@class='androidx.viewpager.widget.ViewPager']]]]/*/*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup']])[2]")).click();
        driver.findElement(By.xpath("//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Saya']]")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Log Masuk']")));
        driver.findElement(By.xpath("//*[@text='Log Masuk']")).click();
        driver.findElement(By.xpath("//*[@id='cret_edit_text' and ./parent::*[@id='edtLoginId']]")).click();
        driver.findElement(By.xpath("//*[@id='cret_edit_text' and ./parent::*[@id='edtPassword']]")).click();
        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
        driver.swipe(706, 923, 706, 1063, 593);
        driver.findElement(By.xpath("//*[@id='cret_edit_text' and ./parent::*[@id='edtLoginId']]")).sendKeys("luqmanafif283@gmail.com");
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='btnLogin']")));
        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//*[@id='cret_edit_text' and ./parent::*[@id='edtLoginId']]")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}