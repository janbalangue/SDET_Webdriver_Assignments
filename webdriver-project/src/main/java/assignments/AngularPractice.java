package assignments;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AngularPractice implements Assignment {

	List<String[]> linksList;
	Iterator<String[]> iterator;

	@Override
	public void runTest(WebDriver driver) {
		try {
			linksList = new LinksList().linkList(new FileReader("./csv/angularpractice.csv"));
			iterator = linksList.iterator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.get(iterator.next()[0]);
		driver.manage().window().maximize();
		new Screenshot().takeScreenshot(driver, this.getClass().getSimpleName(), atomicLong);

		driver.findElement(By.xpath(iterator.next()[0])).sendKeys(iterator.next()[0]);
		driver.findElement(By.xpath(iterator.next()[0])).sendKeys(iterator.next()[0]);
		driver.findElement(By.xpath(iterator.next()[0])).sendKeys(iterator.next()[0]);
		driver.findElement(By.xpath(iterator.next()[0])).click();
		new Screenshot().takeScreenshot(driver, this.getClass().getSimpleName(), atomicLong);

		new Select(driver.findElement(By.id(iterator.next()[0]))).selectByVisibleText(iterator.next()[0]);

		driver.findElement(By.xpath(iterator.next()[0])).click();
		driver.findElement(By.name(iterator.next()[0])).sendKeys(iterator.next()[0]);
		driver.findElement(By.xpath(iterator.next()[0])).click();
		new Screenshot().takeScreenshot(driver, this.getClass().getSimpleName(), atomicLong);

		System.out.println("Success at " + driver.getCurrentUrl() + " using " + driver.getClass());
		driver.quit();
	}

}
