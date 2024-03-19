package basiccodes;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.plantsguru.com/index.php?route=account/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input-email")).sendKeys("vilsyj@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
