package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class App {

	public static void main(String[] args) {
		setProperties();
		runTest(new ChromeDriver());
		runTest(new FirefoxDriver());
	}
	
	public static void setProperties() {
		System.setProperty("webdriver.chrome.driver","/opt/homebrew/Caskroom/chromedriver/103.0.5060.53/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/opt/homebrew/Cellar/geckodriver/0.31.0/bin/geckodriver");
	}
	
	public static void runTest(WebDriver driver) {
		WebDriver testDriver = driver;
		testDriver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Vanilla Ice");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("yo.illsolveit@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("cantremember");
		driver.findElement(By.xpath("//*[@id='exampleCheck1']")).click();
		
		Select dropGender = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		dropGender.selectByVisibleText("Male");
		
		driver.findElement(By.xpath("//*[@id='inlineRadio1']")).click();
		driver.findElement(By.name("bday")).sendKeys("07162017");
		driver.findElement(By.xpath("//*[@value='Submit']")).click();
		
		System.out.println("Success: " + driver.getClass());
		driver.quit();
	}

}
