package mergeLeadPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificationMethod;


public class MergeLeadPage extends ProjectSpecificationMethod {

	public  MergeLeadPage clickMergeButton(String firstName, String firstName1) throws InterruptedException {
		
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		//System.out.println(driver);
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		id = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(id);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName1);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		return this;
		}
	
	public ViewLeadPage clickAlert() throws InterruptedException {
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		return new ViewLeadPage();
		
	}
		
		
		
		
		
		



}
