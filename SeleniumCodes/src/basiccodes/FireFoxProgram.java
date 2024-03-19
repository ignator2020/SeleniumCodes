package basiccodes;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Web Driver");
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://jqueryui.com/droppable/");
		driver1.manage().window().maximize();
		Thread.sleep(3000);
	}

}
