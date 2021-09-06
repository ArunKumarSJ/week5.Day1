package week5.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadAsn extends BaseClass1  {
	

	@Test
	public void Duplicatelead() {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@type='text'])[30]").sendKeys("arun");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("//a[text()='arun']").click();
		String Title1 = driver.getTitle();
		System.out.println("The Title of the page is:" + Title1);
		driver.findElementByLinkText("Edit").click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElementByClassName("smallSubmit").click();
		String Text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("The changed name of Company is:" + Text1);
		
	}
}
