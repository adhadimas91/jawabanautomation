package saucedemo.webdriverinit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverInit {

    public WebDriver driver;

    @Before
    public void setUp() {
         driver = new ChromeDriver();
       // driver = new FirefoxDriver();
        driver.get("https://www.elevenia.co.id/");
       driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void close() {
        driver.quit();
    }
}