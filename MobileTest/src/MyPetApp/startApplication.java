package MyPetApp;
//appium
//Rob's Safe Push
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//dependencies
import java.io.File;
import java.net.URL;
import java.util.List;

import org.testng.ITestContext;
//testng
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.junit.*;
import org.testng.xml.*;

//selenium
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class startApplication 
{
    private AppiumDriver<AndroidElement> driver;
    @BeforeTest
    public void setUp() throws Exception 
    {
        
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/apps/Twitter/");
        File app = new File(appDir, "com.twitter.android-5.74.apk");
        
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.twitter.android");
        capabilities.setCapability("deviceName", "Just a Device");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    @AfterTest
    public void tearDown() throws Exception 
    {
        driver.quit();
    }
    @Test
    public void signupTwitter() throws InterruptedException
    {
        WebElement el = driver.findElement(By.id("com.android.twitter/id:sign_up"));;
        el.click();
        Thread.sleep(5000); 
    }
    @Test
    public void logoutTwitter1() throws InterruptedException
    {
        WebElement el = driver.findElement(By.name("Add Contact"));
        el.click();
        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("Some Name");
        textFieldsList.get(2).sendKeys("Some@example.com");
        driver.swipe(100, 500, 100, 100, 2);
        driver.findElementByName("Save").click();
        Thread.sleep(5000); 
    }
    @Test
    public void logoutTwitter2() throws InterruptedException
    {
        WebElement el = driver.findElement(By.name("Add Contact"));
        el.click();
        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("Some Name");
        textFieldsList.get(2).sendKeys("Some@example.com");
        driver.swipe(100, 500, 100, 100, 2);
        driver.findElementByName("Save").click();
        Thread.sleep(5000); 
    }
    @Test
    public void logoutTwitter3() throws InterruptedException
    {
        WebElement el = driver.findElement(By.name("Add Contact"));
        el.click();
        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("Some Name");
        textFieldsList.get(2).sendKeys("Some@example.com");
        driver.swipe(100, 500, 100, 100, 2);
        driver.findElementByName("Save").click();
        Thread.sleep(5000); 
    }
    @Test
    public void logoutTwitter4() throws InterruptedException
    {
        WebElement el = driver.findElement(By.name("Add Contact"));
        el.click();
        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("Some Name");
        textFieldsList.get(2).sendKeys("Some@example.com");
        driver.swipe(100, 500, 100, 100, 2);
        driver.findElementByName("Save").click();
        Thread.sleep(5000); 
    }
    @Test
    public void logoutTwitter5() throws InterruptedException
    {
        WebElement el = driver.findElement(By.name("Add Contact"));
        el.click();
        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("Some Name");
        textFieldsList.get(2).sendKeys("Some@example.com");
        driver.swipe(100, 500, 100, 100, 2);
        driver.findElementByName("Save").click();
        Thread.sleep(5000); 
    }
    @Test    
    public void hirob() throws InterruptedException
    {
        WebElement el = driver.findElement(By.name("Add Contact"));
        el.click();
        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("Some Name");
        textFieldsList.get(2).sendKeys("Some@example.com");
        driver.swipe(100, 500, 100, 100, 2);
        driver.findElementByName("Save").click();
        Thread.sleep(5000); 
    }
}