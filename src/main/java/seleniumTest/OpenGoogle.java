package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ExtentHtmlReporter reporter= new ExtentHtmlReporter("report.html");
		ExtentReports extentReports=new ExtentReports();
		extentReports.attachReporter(reporter);
		ExtentTest test=extentReports.createTest("hg");
		ExtentTest test1=extentReports.createTest("H. G. Wells - ");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com"); 
		driver.findElement(By.name("q")).sendKeys("hg");
		driver.findElement(By.name("q")).submit();
		driver.findElement(By.partialLinkText("H. G. Wells - ")).click();
		test.pass("Test Passed");
		
		driver.quit();
		extentReports.flush();

	}

}
