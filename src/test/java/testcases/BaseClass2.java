
package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class BaseClass2 {
    public static WebDriver driver;
	XSSFWorkbook wbook;
	XSSFSheet    sheet;
	
	//for report generation
	ExtentReports report;
	ExtentTest  test ;
	
	
	@BeforeMethod
	public void setup(Method method) {
		//for report generation
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C://Temp//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.simplilearn.com/");
		driver.get("https://amazon.com//");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
	}
	@AfterMethod

	public void timeOut(){

		//driver.quit();
	}


}
