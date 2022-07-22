package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Realtor implements Assignment {
	
	public Realtor() {
	}

	@Override
	public void runTest(WebDriver driver) throws FileNotFoundException {
		
		driver.manage().window().maximize();
		driver.get("https://www.realtor.com/");
		WebElement searchElement = driver.findElement(By.xpath("//input[@id='searchbox-input']"));
		searchElement.sendKeys("New York");
		new Select(searchElement).selectByVisibleText("New York, NY");

		WebElement propertyTypeElement = new WebDriverWait(driver, 5L, 5L)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Property Type']")));
		new Select(propertyTypeElement).selectByIndex(1);

		WebElement priceElement = driver.findElement(By.xpath("//span[normalize-space()='Price']"));
		priceElement.click();
		WebElement minPriceElement = driver.findElement(By
				.xpath("//div[@class='jsx-1969582668 col-xxs-6 min-range-desktop range-input']//span[@role='button']"));
		new Select(minPriceElement).selectByVisibleText("$250K");
		WebElement maxPriceElement = driver
				.findElement(By.xpath("//div[@class='jsx-1969582668 input-group']//span[@role='button']"));
		new Select(maxPriceElement).selectByVisibleText("$400K");

		WebElement moreFiltersElement = driver.findElement(By.xpath("//span[normalize-space()='More Filters']"));
		moreFiltersElement.click();
		new Actions(driver).click(driver.findElement(By.xpath("//label[@aria-label='Select 1+ Beds']")));
		new Actions(driver).click(driver.findElement(By.xpath("//label[@aria-label='Select 1+ Baths']")));
		new Actions(driver).click(driver.findElement(By.xpath("//span[normalize-space()='Existing Homes']")));
		new Actions(driver).click(driver.findElement(By.xpath("//input[@id='listings-hide_pnd']")));
		new Actions(driver)
				.click(driver.findElement(By.xpath("//span[@class='jsx-2314149665 mobile-search-result-count']")));
		driver.findElement(By.xpath("//input[@placeholder='Select a keyword below or type here...']"))
				.sendKeys("Basement");

		// commute
		driver.findElement(By.xpath(
				"//div[@id='filter-section-header-commute']//div[@class='jsx-1143219402 section-header-wrapper']"))
				.click();
		driver.findElement(By.xpath("//input[@id='autocomplete-input']")).sendKeys("1 Pendleton Pl, Staten Island, NY");

		// HOA fees
		driver.findElement(
				By.xpath("//div[@id='filter-section-header-hoa']//div[@class='jsx-1143219402 section-header-wrapper']"))
				.click();
		new Actions(driver).click(driver.findElement(By.xpath("//label[@for='none']")));

		// days on realtor.com
		driver.findElement(By.xpath(
				"//div[@id='filter-section-header-days-on-realtor']//div[@class='jsx-1143219402 section-header-wrapper']"))
				.click();
		new Actions(driver).click(driver.findElement(By.xpath("//label[@aria-label='Select Posted today']")));

		// expand search
		driver.findElement(By.xpath(
				"//div[@id='filter-section-header-expand']//div[@class='jsx-1143219402 section-header-wrapper']"))
				.click();
		new Actions(driver).click(driver.findElement(By.xpath("//label[@aria-label='Select 1 Mile']")));

		// home size
		driver.findElement(By.xpath(
				"//div[@id='filter-section-header-home-size']//div[@class='jsx-1143219402 section-header-wrapper']"))
				.click();
		new Select(driver.findElement(
				By.xpath("//div[@class='jsx-1969582668 col-xxs-6 min-range range-input']//span[@role='button']")))
				.selectByVisibleText("500 sqft");
		new Select(driver.findElement(
				By.xpath("//div[@class='jsx-1969582668 col-xxs-6 max-range range-input']//span[@role='button']")))
				.selectByVisibleText("2250 sqft");
		
		// lot size
		driver.findElement(By.xpath("//div[@id='filter-section-header-lot-size']//div[@class='jsx-1143219402 section-header-wrapper']")).click();
		new Select(driver.findElement(By.xpath("//select[@id='lot-size-input-1']"))).selectByVisibleText("2000 sqft");
		new Select(driver.findElement(By.xpath("//select[@id='lot-size-input-2']"))).selectByVisibleText("3000 sqft");
		
		// home age
		driver.findElement(By.xpath("//div[@id='filter-section-header-age']//div[@class='jsx-1143219402 section-header-wrapper']")).click();
		new Select(driver.findElement(By.xpath("//select[@id='home-age-input-1']"))).selectByVisibleText("1 years");
		new Select(driver.findElement(By.xpath("//select[@id='home-age-input-2']"))).selectByVisibleText("3 years");
		
		// stories
		driver.findElement(By.xpath("//*[@id=\"filter-section-header-stories\"]/div")).click();
		new Select(driver.findElement(By.xpath("//label[@aria-label='Select Single home stories']"))).selectByVisibleText("Single");
		
		// garage
		driver.findElement(By.xpath("//div[@id='filter-section-header-garage']//div[@class='jsx-1143219402 section-header-wrapper']")).click();
		new Select(driver.findElement(By.xpath("//label[@aria-label='Select 1+ Parkings']"))).selectByVisibleText("1+");
		

	}
	
	@Override
	public List<String> linkList(File file) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
