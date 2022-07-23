package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AngularPractice implements Assignment {

	@Override
	public void runTest(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Vanilla Ice");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("yo.illsolveit@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("cantremember");
		driver.findElement(By.xpath("//*[@id='exampleCheck1']")).click();

		new Select(driver.findElement(By.id("exampleFormControlSelect1"))).selectByVisibleText("Male");

		driver.findElement(By.xpath("//*[@id='inlineRadio1']")).click();
		driver.findElement(By.name("bday")).sendKeys("07162017");
		driver.findElement(By.xpath("//*[@value='Submit']")).click();

		System.out.println("Success at " + driver.getCurrentUrl() + " using " + driver.getClass());
		driver.quit();
	}

}
