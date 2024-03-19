package basiccodes;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotCode {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\Web Driver\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.plantsguru.com/");
		driver.manage().window().maximize();
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\vilsy\\Dropbox\\My PC (DESKTOP-E28ART4)\\Documents\\Software Testing - Techmindz\\Automation Testing\\Screenshots\\Screenshot1.jpg"));
		

	}

}
