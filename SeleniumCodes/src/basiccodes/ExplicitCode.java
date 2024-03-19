package basiccodes;


import java.io.File;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.k5learning.com/");
		driver.manage().window().maximize();
		//explicit wait code
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"block-swiftypesearch\"]/div/form/input")).sendKeys("Worksheets");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block-swiftypesearch\"]/div/form/input")));
		
		//driver.navigate().back();
		//driver.quit();
		
		
	}

}
