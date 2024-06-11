package testcases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumActions extends BaseClass2{

    @Test
    public void login() throws IOException, AWTException {

        Actions action = new Actions(driver);

        //drag and drop
        action.dragAndDrop(driver.findElement(By.id("")),driver.findElement(By.id(""))).perform();

        action.dragAndDropBy((driver.findElement(By.id(""))),20,80).perform();;

        //Navigation
        action.moveToElement(driver.findElement(By.id(""))).perform();;

        //right click
        action.contextClick(driver.findElement(By.id(""))).perform();;

        //double click
        action.doubleClick(driver.findElement(By.id(""))).perform();

        WebElement userName = driver.findElement(By.id(""));

        //key down and up

        action.keyDown(userName, Keys.ENTER);
        action.keyUp(userName, Keys.ENTER);

        //Java script executor class method

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("location.reload()");

        js.executeScript("document.getElementByID('').value = ('xyz')");

        js.executeScript("alert('hello world');");

        js.executeScript("window.scrollBy(0,150)");

        js.executeScript("arguments[0].click();",userName);


        //screenshot capture

        TakesScreenshot ts = (TakesScreenshot)driver;
        File Source = ts.getScreenshotAs(OutputType.FILE);
        File Destination = new File("Image.png");
        FileUtils.copyFile(Source,Destination);

        //robot class use
        //keyPress,mousePress,keyRelease,mouseRelease,mouseMove

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_SUBTRACT);
        robot.mouseMove(120,480);

        //switch window function

        String Parent_Window  = driver.getWindowHandle();
        Set<String> ListOfWindows = driver.getWindowHandles();

        for(String windows:ListOfWindows){

            if(windows.equals(Parent_Window)){
                driver.switchTo().defaultContent();
            }

        }

        //finding all links

        List<WebElement> allLinks = driver.findElements(By.id(""));

        for(WebElement link:allLinks){

            link.getAttribute("href").substring(0,8);
        }

        //manage basic functions

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(9000,TimeUnit.MILLISECONDS);







    }
}
