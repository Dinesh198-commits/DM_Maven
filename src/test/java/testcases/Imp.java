package testcases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Imp extends BaseClass2{

    @Test
    public void imp() throws IOException {

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        for(WebElement all : allLinks){

            System.out.println(all.getAttribute("href"));

        }
        List<WebElement> allimages = driver.findElements(By.tagName("img"));
        for(WebElement all : allimages){

            System.out.println(all.getAttribute("src"));

        }

        TakesScreenshot TS = (TakesScreenshot)driver;
        File source = TS.getScreenshotAs(OutputType.FILE);
        File Des = new File("Take.png");
        FileUtils.copyFile(source,Des);




    }
}
