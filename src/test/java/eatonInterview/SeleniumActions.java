package eatonInterview;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumActions {

    @Test
    public void login() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().fullscreen();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.selenium.com");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        //implicitly wait
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //explicitly wait
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement locator = driver.findElement(By.id(""));
        WebElement locator1 = driver.findElement(By.id(""));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(""))));
        //Fluent wait
        Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS);
        wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(""))));

        //Navigation
        Actions action = new Actions(driver);
        action.moveToElement(locator).build().perform();
        action.doubleClick(locator1).build().perform();
        action.contextClick(locator).build().perform();
        action.dragAndDrop(locator,locator1).build().perform();
        action.sendKeys(Keys.ENTER).perform();

        //java script executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("Arguments[0].click()",locator);

        //refresh page
        //js.executeScript(“location.reload()");
        js.executeScript("alert('Hello')");
        js.executeScript("windows.scrollBy(0,150)");
        //js.executeScript(“document.getElementByID(‘element id ’).value = ‘xyz’;”));

        Select select = new Select(locator);
        select.selectByIndex(1);
        select.selectByVisibleText("Hello");
        select.selectByValue("5");
        select.getAllSelectedOptions();

        //element
        locator1.isDisplayed();
        locator1.isEnabled();
        locator1.isSelected();

        //Radio button
        boolean state = locator1.isSelected();
        if(state==false){
            locator1.click();
        }

        //Data picker





    }

    @Test
    public void datePicker() throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class = 'flt_fsw_inputBox dates inactiveWidget ']")).click();
        Thread.sleep(2000);

        Date d = new Date(1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String date = sdf.format(d);
        String splitter[] = date.split("-");
        String month_year = splitter[1];
        String day = splitter[0];
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));

        for (int i=0; i<elements.size();i++) {
            System.out.println(elements.get(i).getText());
        }
        for (WebElement e:elements)
        {
            if(e.getText().substring(0,1).equals("1"))
            {
                e.click();
        }}

    }
    @Test
    public void dataHandling() throws IOException, CsvValidationException {
        CSVReader csv = new CSVReader(new FileReader("data.csv"));
        String [] cell;
        while((cell =csv.readNext())!=null){

            int i = 0;
            String FirstName = cell[0];
            String FirstName1 = cell[0];

        }
        File file = new File("data.xlsx");
        FileInputStream Fi = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(Fi);
        XSSFSheet sheet = wb.getSheet("File");
        int RowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

        String colomnData = sheet.getRow(0).getCell(1).getStringCellValue();
        
    }
    @Test
    public void screenShot(){
        WebDriver driver = new ChromeDriver();
        TakesScreenshot ts = (TakesScreenshot) driver;
        //ts.
        
        
    }
}
