package week5.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadAsn extends BaseClass1{
	

	@Test
	public void Deletelead() throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Phone").click();
		driver.findElement(By.name("phoneNumber")).sendKeys("984874652");
		driver.findElement(By.id("ext-gen334")).click();
		Thread.sleep(20000);
		WebElement id = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String text = id.getText();
		id.click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElement(By.id("ext-gen246")).sendKeys(text);
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		WebElement verfy = driver.findElementByXPath("//div[text()='No records to display']");
		if (verfy.isDisplayed() == true) {
			System.out.println("No Records to display");
		}
		
	}
}