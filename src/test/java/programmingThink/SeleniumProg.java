package programmingThink;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumProg {
    public WebDriver driver;

    @Test
    public void t1() throws IOException {
        //Screen shot code
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File Destination = new File(System.getProperty("user.dir") + "/screenshots/image.png");
        FileUtils.copyFile(source,Destination);

        //Java script code
        //JavaExecuteScript
        //JavaAsyncExecuteScript

        JavascriptExecutor js = (JavascriptExecutor)driver;
        //Simple click
        js.executeScript("args[0].click()","element");

        //Refresh page
        js.executeScript("location.reload()");

        //alert popup generation
        js.executeScript("alert('Hello');");

        //Data send
        js.executeScript("document.getElementByID(‘element id ’).value = ‘xyz’;");

        //Scroll
        js.executeScript("window.scrollBy(0,150");


        //Double click and right click and mouse hover

        Actions action = new Actions(driver);
        action.doubleClick();
        action.contextClick();
        //action.moveToElement();

        //Window action
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        //Explicit wait
        WebElement dummy = driver.findElement(By.id("5"));
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("5")));

        //Cookies
        driver.manage().deleteAllCookies();

        //Alert

        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        alert.sendKeys("Hii");

        //window handling
        Set<String> ls = driver.getWindowHandles();
        String Parent = driver.getWindowHandle();

        for(String win:ls){
            if(win.equals(Parent)){
                driver.switchTo().defaultContent();
            }
        }





    }
}
