package basiccodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitCode2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.k5learning.com/");
		driver.manage().window().maximize();
		//implicit wait
		driver.findElement(By.xpath("//*[@id=\"block-signupandsigninlinks\"]/div/div/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys("vilsyjomon33");
		
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("Password@123");
		driver.findElement(By.xpath("//*[@id=\"edit-submit-1709096216\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				

	}

}
