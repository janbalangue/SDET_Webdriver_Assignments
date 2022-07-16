package assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {

	public static void main(String[] args) {
		setProperties();
		new Assignment1().runTest(new ChromeDriver());
		new Assignment1().runTest(new FirefoxDriver());
		new Assignment2().runTest(new ChromeDriver());
		new Assignment2().runTest(new FirefoxDriver());
	}
	
	public static void setProperties() {
		
		// to run locally, replace the filepaths with local values
		System.setProperty("webdriver.chrome.driver","/opt/homebrew/Caskroom/chromedriver/103.0.5060.53/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/opt/homebrew/Cellar/geckodriver/0.31.0/bin/geckodriver");
	}
	
}
