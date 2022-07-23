package assignments;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SauceDemo implements Assignment {

	static AtomicLong atomicLong;
	List<String[]> linksList;
	Iterator<String[]> iterator;

	public SauceDemo() {
		atomicLong = new AtomicLong(0L);
	}

	@Override
	public void runTest(WebDriver driver) {
		try {
			linksList = new LinksList().linkList(new FileReader("./saucedemo.csv"));
			iterator = linksList.iterator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.get(iterator.next()[0]);
		driver.manage().window().maximize();
		takeScreenshot(driver);
		driver.findElement(By.xpath(iterator.next()[0])).sendKeys(iterator.next()[0]);
		driver.findElement(By.xpath(iterator.next()[0])).sendKeys(iterator.next()[0]);
		driver.findElement(By.xpath(iterator.next()[0])).click();
		takeScreenshot(driver);
		driver.findElement(By.xpath(iterator.next()[0])).click();
		driver.findElement(By.xpath(iterator.next()[0])).click();
		driver.findElement(By.xpath(iterator.next()[0])).click();
		takeScreenshot(driver);
		driver.findElement(By.xpath(iterator.next()[0])).sendKeys(iterator.next()[0]);
		driver.findElement(By.xpath(iterator.next()[0])).sendKeys(iterator.next()[0]);
		driver.findElement(By.xpath(iterator.next()[0])).sendKeys(iterator.next()[0]);
		driver.findElement(By.xpath(iterator.next()[0])).click();
		takeScreenshot(driver);
		driver.findElement(By.xpath(iterator.next()[0])).click();
		takeScreenshot(driver);
		driver.quit();
	}

	public void takeScreenshot(WebDriver driver) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(
				"./saucedemo-" + driver.getClass().getSimpleName() + "-" + atomicLong.incrementAndGet() + ".png");
		try {
			FileUtils.copyFile(screenshot, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
