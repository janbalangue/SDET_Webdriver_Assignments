package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment2 {
		
	public void runTest(WebDriver driver) {
		driver.get("https://phptravels.com/demo");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Vanilla");
		driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Ice");
		driver.findElement(By.xpath("//*[@placeholder='Business Name']")).sendKeys("DevLabs Alliance");
		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("yo.illsolveit@gmail.com");
		driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")).click();
		
		System.out.println("Success at " + driver.getCurrentUrl() + " using " + driver.getClass());
		driver.quit();
	}

}
