package basiccodes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CrossBrowserProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//Drag and Drop
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
				Actions a =new Actions(driver);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggable\"]")),
				driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).build().perform();
				Thread.sleep(2000);
				
	}

}
