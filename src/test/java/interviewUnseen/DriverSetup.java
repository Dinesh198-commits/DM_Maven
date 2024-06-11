package interviewUnseen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class DriverSetup {
    public static  WebDriver driver;
    @BeforeMethod
    public WebDriver Driver(){
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver  driver = new ChromeDriver(options);
        driver.get("");
        return driver;
    }
    public void screenshot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("Image.png");
        FileUtils.copyFile(source,destination);
    }

}
