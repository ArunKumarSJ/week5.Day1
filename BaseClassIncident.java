package week5.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassIncident {
	public ChromeDriver driver;

	@BeforeMethod
	public void Preconditions() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dev70491.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementByName("user_password").sendKeys("Arunkum@r9896");
		driver.findElementById("sysverb_login").click();
		WebElement filterbox = driver.findElementById("filter");
		Thread.sleep(2000);
		filterbox.sendKeys("Incident");
		Thread.sleep(3000);
		filterbox.sendKeys(Keys.ENTER);
	}

	@AfterMethod
	public void Postconditions() {
		driver.close();
	}
}
