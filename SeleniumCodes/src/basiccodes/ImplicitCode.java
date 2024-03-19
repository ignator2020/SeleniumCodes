package basiccodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.k5learning.com/");
		driver.manage().window().maximize();
		//implicit wait
		driver.findElement(By.xpath("//*[@id=\"block-swiftypesearch\"]/div/form/input")).sendKeys("Worksheet");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

}
