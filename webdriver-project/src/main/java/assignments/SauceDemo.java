package assignments;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemo implements Assignment {

	List<String[]> linksList;
	Iterator<String[]> iterator;

	public SauceDemo() {
	}

	@Override
	public void runTest(WebDriver driver) {
		try {
			linksList = new LinksList().linkList(new FileReader("./csv/saucedemo.csv"));
			iterator = linksList.iterator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.get(iterator.next()[0]);
		driver.manage().window().maximize();
		new Screenshot().takeScreenshot(driver, this.getClass().getSimpleName(), atomicLong);

		driver.findElement(By.xpath(iterator.next()[0])).sendKeys(iterator.next()[0]);
		driver.findElement(By.xpath(iterator.next()[0])).sendKeys(iterator.next()[0]);
		driver.findElement(By.xpath(iterator.next()[0])).click();
		new Screenshot().takeScreenshot(driver, this.getClass().getSimpleName(), atomicLong);

		driver.findElement(By.xpath(iterator.next()[0])).click();
		driver.findElement(By.xpath(iterator.next()[0])).click();
		driver.findElement(By.xpath(iterator.next()[0])).click();
		new Screenshot().takeScreenshot(driver, this.getClass().getSimpleName(), atomicLong);

		driver.findElement(By.xpath(iterator.next()[0])).sendKeys(iterator.next()[0]);
		driver.findElement(By.xpath(iterator.next()[0])).sendKeys(iterator.next()[0]);
		driver.findElement(By.xpath(iterator.next()[0])).sendKeys(iterator.next()[0]);
		driver.findElement(By.xpath(iterator.next()[0])).click();
		new Screenshot().takeScreenshot(driver, this.getClass().getSimpleName(), atomicLong);

		driver.findElement(By.xpath(iterator.next()[0])).click();
		new Screenshot().takeScreenshot(driver, this.getClass().getSimpleName(), atomicLong);

		driver.quit();
	}

}
