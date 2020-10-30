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
        dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Luqman afif\\AppData\\Roaming\\appiumstudio\\original-apks\\com.shopee.mycom.shopee.app.ui.home.HomeActivity_.2.apk");
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
        driver.findElement(By.xpath("(//*[@class='android.widget.FrameLayout' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@class='androidx.viewpager.widget.ViewPager']]]]/*/*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup']])[2]")).click();
        driver.findElement(By.xpath("//*[@text='Mydin: Dutch Lady  X3  @ RM56.70']")).sendKeys("Bahulu");
        driver.executeScript("seetest:client.deviceAction(\"Enter\")");
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(((//*[@class='androidx.recyclerview.widget.RecyclerView']/*/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]])[2]/*[@class='android.view.ViewGroup'])[1]/*/*[@class='android.widget.ImageView' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']])[1]")));
        driver.findElement(By.xpath("(((//*[@class='androidx.recyclerview.widget.RecyclerView']/*/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]])[2]/*[@class='android.view.ViewGroup'])[1]/*/*[@class='android.widget.ImageView' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']])[1]")).click();
        driver.swipe(266, 736, 263, 183, 734);
        driver.swipe(250, 760, 240, 66, 730);
        driver.swipe(216, 1426, 216, 2266, 713);
        driver.swipe(3, 1200, 260, 2850, 1716);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}